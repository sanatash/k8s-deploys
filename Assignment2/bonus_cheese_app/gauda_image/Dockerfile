
# Use official nginx image as base image
FROM nginx

# Copy the custom index file to the appropriate location
COPY gauda-index.html /usr/share/nginx/html/index.html
RUN mkdir /usr/share/nginx/html/images
COPY Gouda_36_mois.jpg /usr/share/nginx/html/images/gauda.jpg

# Expose port 80 for incoming traffic - serves here as reference, because already exposed in original nginx image
EXPOSE 80



