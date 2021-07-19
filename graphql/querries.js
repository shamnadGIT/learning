mutation {
  createFriend(input: 
  {
    firstName : "Shamnad",
    lastName : "S",
    gender : FEMALE
    email :"m@m.com"
  }) {
    id, firstName, gender, contacts {
      firstName
      lastName
    }
  }
}
//-------------------------------------------------
mutation {
  createFriend(input: 
  {
    firstName : "Shamnad",
    lastName : "S",
    gender : FEMALE
    email :"m@m.com",
    contacts: {firstName:"FN", lastName:"LN"}
  }) {
    id, firstName, gender, contacts {
      firstName
      lastName
    }
  }
}
//----------------------------------------------------------
mutation {
  createFriend(input: 
  {
    firstName : "Shamnad",
    lastName : "S",
    gender : FEMALE
    email :"m@m.com",
    contacts: [
      {firstName:"FN1", lastName:"LN1"},
      {firstName:"FN2", lastName:"LN2"},
    ]
  }) {
    id, firstName, gender, contacts {
      firstName
      lastName
    }
  }
}

//------------------------------------------------------------
//update
mutation {
  
  updateFriend(input: {
    id: "60f572f46a6dbd3b221a4846"
    age:45
    firstName:"Test"
  })
  {
    id
    firstName
    gender
    email
    age
  }
}

//------------------------------------------------------------------
//delete
mutation {
  deleteFriend(id: "60f570374b7440369b6f0c33")
}

//-------------------------------------------------------------------
//alias
query {
  friend : getOneFriend(id: "60f5a4e7a97e60479a3bf6ef") {
    firstName
    lastName
    age
  }
  aliens: getAliens{
    firstName
    planet
  } 
}

//-------------------------------------------------------------------------

//fragment
query {
  one : getOneFriend(id: "60f5a4e7a97e60479a3bf6ef") {
    ...friendFragment
  }
  two: getOneFriend(id: "60f5a4e7a97e60479a3bf6ef") {
    ...friendFragment
  }
}

fragment friendFragment on Friend{
  firstName
  lastName
  age
  gender
  email
}
//----------------------------------------------------------------
