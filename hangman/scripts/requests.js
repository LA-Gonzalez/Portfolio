const getPuzzle = async (wordCount)=> {
    const response = await fetch(`//puzzle.mead.io/puzzle?wordCount=${wordCount}`)
    
    if(response.status === 200){
        const data = await response.json()
        return data.puzzle
    }
    else{
        throw new Error("Unable to fetch new puzzle")
    }  
}

const getCurrentCountry = async ()=>{
    const location = await getLocation()
    const country = await getCountry(location.country)
    return country
}

const getCountry = async (code)=>{

    const response = await fetch("//restcountries.eu/rest/v2/all")
    
    if(response.status === 200){
        const data = await response.json()
        const country = data.find(element => element.alpha2Code === code)
        return country
    }
    else{
        throw new Error("Unable to find country")
    }
}

const getLocation = async ()=>{
    const response = await fetch("//ipinfo.io/json?token=a4bbfacef4c552")
   
    if(response.status === 200){
        const data= await response.json()
        return data
    }
    else{
        throw new Error("Unable to find location")
    }
}
