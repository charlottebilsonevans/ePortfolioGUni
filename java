// Smooth Scrolling - Already defined

// Dynamically Load Portfolio Items
document.addEventListener('DOMContentLoaded', function() {
    const portfolioContainer = document.querySelector('.portfolio-container');

    // Placeholder for portfolio data, you'd likely fetch this from a server or API
    const portfolioItems = [
        { id: 1, title: 'Project One', imageUrl: 'path/to/image1.jpg', description: 'Description for Project One' },
        { id: 2, title: 'Project Two', imageUrl: 'path/to/image2.jpg', description: 'Description for Project Two' },
        // More items...
    ];

    // Create portfolio item elements and append to the container
    portfolioItems.forEach(item => {
        portfolioContainer.innerHTML += `
            <div class="portfolio-item" onclick="showPortfolioItemDetails(${item.id})">
                <img src="${item.imageUrl}" alt="${item.title}" class="portfolio-image">
                <div class="portfolio-description">
                    <h3>${item.title}</h3>
                    <p>${item.description}</p>
                </div>
            </div>
        `;
    });
});

// Function to show portfolio item details, e.g., in a modal or new page
function showPortfolioItemDetails(itemId) {
    console.log('Show details for portfolio item:', itemId);
    // Here you would handle showing the details of the portfolio item
    // This could involve fetching more data and displaying it in a modal or navigating to a detailed view
}

// Additional dynamic or interactive behaviors would be added here
