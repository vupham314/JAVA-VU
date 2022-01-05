const newsApi = "https://61d501d78df81200178a8e99.mockapi.io/newLists"

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
            <td><img src="${datum.urlImg}" alt=""></td>
        </tr>`
        table.innerHTML += html
    }
}
async function pushNew(newsApi) {
    let topic = document.getElementById('topic_selector').value
    let title = document.getElementById('title__input').value
    let author = document.getElementById('author__input').value
    let des = document.getElementById('source__input').value
    let content = document.getElementById('content__input').value
    let img = document.getElementById('img__input')

    let news = createNews(topic , title, author , des, content , img)
    await postData(newsApi, news)
    alert('ok')
}

function createNews(topic, title, author, des, content, img) {
    return {
        "topic": topic,
        "title": title,
        "author": author,
        "description": des,
        "content": content,
        "urlImg": img
    }

}

async function postData(newsApi, data = {}) {
    const response = await fetch(newsApi, {
        method: 'POST',
        mode: 'cors',
        cache: 'no-cache',
        credentials: 'same-origin',
        headers: {
            'Content-Type': 'application/json'
        },
        redirect: 'follow',
        referrerPolicy: 'no-referrer', // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
        body: JSON.stringify(data)
    });
    return response.json();
}
