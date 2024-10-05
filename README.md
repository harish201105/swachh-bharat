---

# Swachh-Bharat: A Smart Waste Management Web App

Swachh-Bharat is a web-based waste management solution designed to promote cleaner cities and foster community-driven environmental stewardship, in line with the Swachh Bharat Mission. This platform empowers users to efficiently report garbage dump locations, enabling municipal services and drivers to be notified for timely pickups. It streamlines the waste collection process and incentivizes both citizens and garbage collection drivers with digital rewards, known as E-coins, for each successful garbage pickup.

## Technology Stack

- **Backend**: Spring Boot for scalable, secure, and maintainable server architecture.
- **Frontend**: ReactJS with Redux for seamless user interface and state management.
- **Database**: MySQL for reliable storage and retrieval of user inputs, location data, and notifications.

## Features and Functionality

### Role-Based Authorization
- **Normal Users**: Citizens who can add, update, and manage garbage dump locations in their locality.
- **Driver Users**: Municipal or independent drivers receive notifications to clean garbage dumps based on reported locations.

### E-Coin Reward System
Swachh-Bharat introduces a unique reward system. Both Normal Users and Driver Users earn E-coins after each successful garbage collection. E-coins act as a digital currency to encourage participation. Future plans include expanding the E-coin system for community rewards and redemption options.

### Dashboard and Tracking
Users have access to a responsive dashboard where they can:
- View added garbage dump locations.
- Track E-coin earnings and monitor environmental contributions.
- Manage reported locations by editing or deleting entries.
- Upload images of garbage dump locations for driver verification.

### Real-Time Location Tracking (In Development)
Google Maps integration enables drivers to track garbage dumps from their current location, optimizing the pickup process.

### Notification System
Normal Users can notify drivers of reported garbage dumps. Notifications are based on geographic data, ensuring drivers are alerted only for dumps within their operational areas.

### Image Upload for Verification
Normal Users can upload images of garbage dumps, providing drivers with visual verification to improve the accuracy and speed of pickups.

## Testing
Backend services are rigorously tested using:
- **JUnit5**
- **Mockito**
- **MockMvc**

## Current Progress
- Role-based authorization for Normal Users and Driver Users is implemented.
- Users can add, update, and delete garbage dump locations.
- Unit testing of backend services is completed.

## Future Enhancements
- Implementation of the E-coin reward system.
- Google Maps integration for route tracking.
- Refinement of the notification system for real-time alerts.

## Conclusion
Swachh-Bharat leverages modern technology to solve the persistent issue of waste management. By empowering citizens and improving the efficiency of garbage collection through driver notifications, the app aims to make cities cleaner and more livable. The introduction of the E-coin digital reward system adds a gamification element, encouraging sustained engagement. Once fully developed, Swachh-Bharat will significantly contribute to the Swachh Bharat Mission's goal of achieving a cleaner India.

---