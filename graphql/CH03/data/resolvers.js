import { Friends} from  './dbConnectors';
/*class Friend {
    constructor(id, { firstName, lastName, gender, email, contacts}) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        //this.contacts = contacts;
    }
} */

//resolver map
export const resolvers = {

    Query :{
        getFriend : ({id}) => {
            return new Friend(id, friendDatabase[id]);
        },  
    
    },
    Mutation: {
        createFriend : (root, { input }) => {
            const newFriend = new Friends({
                firstName = input.firstName,
                lastName = this.lastName,
                gender = this.gender,
                email = this.email
                //contacts = this.contacts;
    
            });

            newFriend.id = newFriend._id;

            return new Promise((resolve, object) => {
                newFriend.save((err) =>  {
                    if (err) reject(err)
                    else resolve(newFriend)
                })
            })
        }
    },
};

//export default resolvers;
