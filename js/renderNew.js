const newsApi = "https://61ce76d17067f600179c5ed4.mockapi.io/newList"

async function getDataNews(newsApi) {
    return await fetch(newsApi).then(res=>res.json())
}

async function renderNews(newsApi) {
    let data = await getDataNews(newsApi)
    for (const datum of data) {
        let table = document.getElementById('table')
        let html = `        
        <tr>
            <td>${datum.id}</td>
            <td>${datum.topic}</td>
            <td>${datum.title}</td>
            <td>${datum.author}</td>
            <td>${datum.createdAt}</td>
            <td>${datum.content}</td>
            <td><img style="width: 50px; height: 50px;" src="${datum.urlImg}" alt=""></td>
        </tr>`
        table.innerHTML += html
    }
}

window.onload = () => {
    renderNews(newsApi)
}