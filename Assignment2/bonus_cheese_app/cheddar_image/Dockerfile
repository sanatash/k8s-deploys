
# Use the Nginx base image
FROM nginx

# Copy the custom Nginx configuration file
COPY nginx.conf /etc/nginx/nginx.conf

# Copy the default welcome pages for the /cheddar path
COPY cheddar-index.html /usr/share/nginx/html/cheddar-index.html

# Expose port 80 for incoming HTTP traffic
EXPOSE 80

# Set the default command to start Nginx
CMD ["nginx", "-g", "daemon off;"]

