
# Use official nginx image as base image
FROM nginx

# Copy the custom index file to the appropriate location
COPY cheddar-index.html /usr/share/nginx/html/index.html
RUN mkdir /usr/share/nginx/html/images
COPY Somerset-Cheddar.jpg /usr/share/nginx/html/images/cheddar.jpg

# Expose port 80 for incoming traffic- serves here as reference, because already exposed in original nginx image
EXPOSE 80

