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
        language: String,
        age : Int,
        email: String,
        contacts: [Contact]
    }

    type Alien {
        id: ID,
        firstName: String,
        lastName: String,
        planet: String,
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
        language: String,
        contacts: [ContactInput]
    }

    input ContactInput {
        firstName: String,
        lastName: String
    }

    type Mutation {
        createFriend(input: FriendInput): Friend
        updateFriend(input: FriendInput): Friend
        deleteFriend(id: ID!): String
    }
`;

const schema = makeExecutableSchema({typeDefs, resolvers});
export { schema };
