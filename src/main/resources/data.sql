INSERT INTO templates (name, description, html, created_at, updated_at) VALUES (
    'Email Newsletter Template',
    'A responsive template designed for sending out email newsletters.',
    '<!DOCTYPE html><html><head><title>Newsletter</title></head><body><div style="font-family: Arial, sans-serif; max-width: 600px; margin: auto; padding: 20px; border: 1px solid #ccc;"><h1 style="color: #333;">Welcome to Our Latest Update!</h1><p>Dear Subscriber,</p><p>This is the content of your newsletter. We have exciting news to share!</p><p>Best regards,<br>The Team</p></div></body></html>',
    '2024-01-15 10:00:00',
    NULL
);

INSERT INTO templates (name, description, html, created_at, updated_at) VALUES (
    'Product Detail Page',
    'A comprehensive layout for showcasing product information and images.',
    '<!DOCTYPE html><html><head><title>Product Detail</title></head><body><div style="font-family: sans-serif; max-width: 800px; margin: auto; padding: 20px;"><h2 style="color: #0056b3;">Amazing Product X</h2><img src="https://placehold.co/400x300/007bff/ffffff?text=Product+Image" alt="Product Image" style="max-width: 100%; height: auto; border-radius: 8px;"><p style="line-height: 1.6;">This is a fantastic product designed to solve all your needs. It features incredible durability and an intuitive interface.</p><p><strong>Price: $99.99</strong></p><button style="background-color: #28a745; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">Add to Cart</button></div></body></html>',
    '2024-02-20 14:30:00',
    NULL
);

INSERT INTO templates (name, description, html, created_at, updated_at) VALUES (
    'Basic Blog Post',
    'A simple and clean template for publishing blog articles and news.',
    '<!DOCTYPE html><html><head><title>Blog Post</title></head><body><div style="font-family: Georgia, serif; max-width: 700px; margin: auto; padding: 25px; line-height: 1.7;"><h3 style="color: #333;">The Art of Doing Nothing</h3><p>In our fast-paced world, the idea of doing nothing often seems counter-intuitive. However, embracing moments of stillness can profoundly impact our well-being and creativity.</p><p>This article explores the benefits of mindful inactivity...</p><small>Published by Jane Doe on 2024-03-05</small></div></body></html>',
    '2024-03-05 09:15:00',
    NULL
);

INSERT INTO templates (name, description, html, created_at, updated_at) VALUES (
    'Contact Us Form',
    'A standard contact form for users to send messages or inquiries.',
    '<!DOCTYPE html><html><head><title>Contact Us</title></head><body><div style="font-family: Arial, sans-serif; max-width: 500px; margin: auto; padding: 30px; border: 1px solid #ddd; border-radius: 10px; background-color: #f9f9f9;"><h4 style="color: #444; text-align: center;">Get in Touch</h4><form><div style="margin-bottom: 15px;"><label for="name" style="display: block; margin-bottom: 5px; font-weight: bold;">Your Name:</label><input type="text" id="name" name="name" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;" required></div><div style="margin-bottom: 15px;"><label for="email" style="display: block; margin-bottom: 5px; font-weight: bold;">Your Email:</label><input type="email" id="email" name="email" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;" required></div><div style="margin-bottom: 20px;"><label for="message" style="display: block; margin-bottom: 5px; font-weight: bold;">Message:</label><textarea id="message" name="message" rows="5" style="width: 100%; padding: 10px; border: 1px solid #ccc; border-radius: 4px;" required></textarea></div><button type="submit" style="width: 100%; padding: 12px; background-color: #007bff; color: white; border: none; border-radius: 5px; font-size: 16px; cursor: pointer;">Send Message</button></form></div></body></html>',
    '2024-04-10 11:00:00',
    NULL
);

INSERT INTO templates (name, description, html, created_at, updated_at) VALUES (
    'Event Registration Page',
    'A template designed for online event sign-ups and attendee information collection.',
    '<!DOCTYPE html><html><head><title>Event Registration</title></head><body><div style="font-family: Verdana, sans-serif; max-width: 650px; margin: auto; padding: 20px; background-color: #e9f7ef; border-radius: 12px;"><h4 style="color: #2c6f4a; text-align: center; margin-bottom: 25px;">Register for Our Upcoming Event!</h4><p style="text-align: center; font-size: 1.1em;">Join us for an exciting session on "Future Tech Trends".</p><form style="padding: 0 20px;"><div style="margin-bottom: 15px;"><label for="event_name" style="display: block; margin-bottom: 5px;">Full Name:</label><input type="text" id="event_name" name="event_name" style="width: 100%; padding: 8px; border: 1px solid #a3d9b4; border-radius: 4px;"></div><div style="margin-bottom: 15px;"><label for="event_email" style="display: block; margin-bottom: 5px;">Email Address:</label><input type="email" id="event_email" name="event_email" style="width: 100%; padding: 8px; border: 1px solid #a3d9b4; border-radius: 4px;"></div><button type="submit" style="width: 100%; padding: 10px; background-color: #28a745; color: white; border: none; border-radius: 5px; font-size: 1em; cursor: pointer; margin-top: 20px;">Confirm Registration</button></form></div></body></html>',
    '2024-05-01 16:45:00',
    NULL
);