import express from 'express';
import schema from './schema';
import { graphqlHTTP } from 'express-graphql';

const app = express();

app.get('/', (req,res) => {
    res.send('Graphql is amazing');
});


//const root = {hello: () => "Hi, I am shamnad"};
const root = { friend : () => {
    return {
        "id" :12345,
        "firstName": "Shamnad",
        "lastName": "S",
        "gender": "Male",
        "email": "shamnad1984@gmail.com"
    }
}};

app.use('/graphql', graphqlHTTP({
    schema: schema,
    rootValue: root,
    graphiql: true,
}));

app.listen(8080, () => console.log("Running on server port localhost:8080/graphql"));