//import { buildSchema } from 'graphql';
import { makeExecutableSchema }  from 'graphql-tools';
import { resolvers } from './resolvers';

/*const schema = buildSchema(`
    type Query {
        hello: String
    }
`)
*/

const typeDefs = `
    type Friend {
        id: ID,
        firstName: String,
        lastName: String,
        gender: Gender,
        age : Int,
        email: String,
        contacts: [Contact]
    }

    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    type Contact {
        firstName: String,
        lastName: String
    }

    type Query {
        getFriend(id : ID): Friend
    }

    input FriendInput {
        id: ID,
        firstName: String,
        lastName: String,
        gender: Gender,
        email: String,
        age: Int,
        contacts: [ContactInput]
    }

    input ContactInput {
        firstName: String,
        lastName: String
    }

    type Mutation {
        createFriend(input : FriendInput): Friend
    }
`;

const schema = makeExecutableSchema(typeDefs, resolvers);
export { schema };
