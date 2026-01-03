# 🌙 Journal Junction

A modern, full-stack journaling web application built with **Spring Boot** that helps users reflect, grow, and build healthy journaling habits with motivational quotes and mood tracking.

**🔗 Live Demo:** [spring-boot-project-production-1a4b.up.railway.app](https://spring-boot-project-production-1a4b.up.railway.app)

---

## 📋 Project Overview

Journal Junction is a self-reflective journaling platform where users can:
- Write daily journal entries with their thoughts and experiences
- Answer guided self-discovery questions
- Track their mood with emoji selectors
- Choose avatars to personalize their experience
- View motivational quotes to inspire their day
- Browse their past entries with easy navigation
- Receive personalized affirmations

The application features a **vibrant yellow-to-red gradient design** with smooth animations and responsive UI optimized for all devices.

---

## 🎯 Key Features

✨ **Core Features:**
- **Journal Entry Creation** - Rich form with multiple input fields
- **Self-Discovery Questions** - Guided prompts for deeper reflection:
  - 3 things you love about yourself
  - What you learned today
  - How you handled challenges
- **Mood Tracking** - Select from 5 emoji moods (😀🙂😐😔😤)
- **Avatar Selection** - Choose from 3 personalized avatars
- **Quote Management** - Random motivational quotes + custom quote addition
- **Entry History** - Browse all past journal entries with truncated previews
- **Responsive Design** - Works seamlessly on desktop, tablet, and mobile

---

## 🛠️ Tech Stack

### Backend
- **Spring Boot 3.x** - Web framework & application bootstrapping
- **Thymeleaf** - Server-side template engine for dynamic HTML
- **Spring Data JPA** - ORM for database persistence
- **Maven** - Build automation & dependency management

### Frontend
- **HTML5** - Semantic markup
- **CSS3** - Advanced styling with:
  - CSS Variables (custom properties)
  - Linear gradients
  - Flexbox layout
  - Backdrop filters & shadows
  - Media queries (responsive design)
  - Smooth transitions & animations
- **Vanilla JavaScript** - Client-side interactions:
  - DOM manipulation
  - Fetch API for async requests
  - Event listeners
  - Form validation

### Database
- **H2 Database** (Development) - In-memory database
- **JPA/Hibernate** - ORM layer

### Deployment
- **Railway** - Cloud deployment platform
- **Docker** - Containerization (Railway auto-builds)

---

## 🏗️ Architecture & Design Patterns

### MVC Pattern
```
Controller (JournalController)
    ↓
Service Layer (MoodService, MotivationService)
    ↓
Repository (JournalRepo - Data Access)
    ↓
Entity (JournalEntry Model)
```

### Project Structure
```
src/main/
├── java/org/anshumalapandit/demo/
│   ├── DemoApplication.java          [Spring Boot Entry Point]
│   ├── controller/
│   │   └── JournalController.java    [Request Handlers]
│   ├── entity/
│   │   └── JournalEntry.java         [Data Model]
│   ├── repo/
│   │   └── JournalRepo.java          [Database Interface]
│   └── service/
│       ├── MoodService.java          [Mood/Emotion Logic]
│       └── MotivationService.java    [Quote Generation]
└── resources/
    ├── templates/
    │   ├── index.html                [Main Form Page]
    │   ├── index2.html               [Alternative Layout]
    │   └── entry.html                [Entry Detail View]
    ├── static/
    │   └── images/                   [Assets]
    └── application.properties         [Config]
```

---

## 🎨 UI/UX Design

### Color Palette (Custom Design)
- **Primary Red:** `#e63946` - Accent color for headings & CTA
- **Secondary Yellow:** `#ffd60a` - Highlights & borders
- **Background Gradient:** Yellow → Orange → Red (135° angle)
- **Accent Cream:** `#fff9e0` - Soft input backgrounds

### Design Features
- **Glassmorphism Effect** - Frosted glass containers with blur
- **Smooth Animations** - Hover effects, transitions, fadeIn keyframes
- **Responsive Grid** - Flexbox-based layout
- **Accessibility** - Good color contrast, semantic HTML, focus states

---

## 🚀 Getting Started

### Prerequisites
- Java 11+ (JDK)
- Maven 3.6+
- Git

### Local Development

1. **Clone the Repository**
```bash
git clone https://github.com/anshumalapandit/spring-boot-project.git
cd spring-boot-project
```

2. **Build the Project**
```bash
mvn clean install
```

3. **Run the Application**
```bash
mvn spring-boot:run
```

4. **Access the App**
```
http://localhost:8080
```

---

## 📚 What I Learned

### Spring Boot Concepts
✅ **Application Setup** - `@SpringBootApplication` auto-configuration  
✅ **Controller Mapping** - `@GetMapping`, `@PostMapping`, `@RequestMapping`  
✅ **Dependency Injection** - `@Autowired` for service layer integration  
✅ **REST Principles** - Request handling & response formatting  
✅ **Data Binding** - Thymeleaf form binding with `th:field`, `th:object`

### Frontend Technologies
✅ **CSS Advanced Features** - Gradients, variables, flexbox, animations  
✅ **JavaScript Async Operations** - Fetch API, async/await, JSON handling  
✅ **DOM Manipulation** - Event listeners, dynamic styling, element selection  
✅ **Form Handling** - Input validation, hidden fields, form submission

### Architecture & Best Practices
✅ **MVC Pattern** - Separation of concerns (Model-View-Controller)  
✅ **Service Layer** - Business logic abstraction from controllers  
✅ **Repository Pattern** - Data access layer abstraction  
✅ **Responsive Design** - Mobile-first approach with media queries  
✅ **Code Organization** - Clean folder structure & naming conventions

### Development Process
✅ **Git & GitHub** - Version control, commits, remote repository management  
✅ **Deployment Pipeline** - Cloud deployment to Railway  
✅ **Build Automation** - Maven for dependency management & building  
✅ **Full-Stack Development** - End-to-end project from code to production

---

## 🔄 API Endpoints

| Method | Endpoint | Purpose |
|--------|----------|---------|
| GET | `/` | Home page with journal form |
| GET | `/entry/{id}` | View single entry details |
| POST | `/add` | Create new journal entry |
| GET | `/quote` | Get random motivational quote |
| POST | `/my-quote/add` | Add custom motivational quote |

---

## 📸 Features Showcase

### Form Inputs
- Multi-line textarea for journal writing
- Text inputs for guided questions
- Hidden emoji field for mood selection
- Avatar selector with visual feedback
- Submit button with gradient styling

### Dynamic Elements
- **Quote Loader** - Fetches motivational quotes on page load
- **Avatar Selection** - Visual feedback with border highlight & transform
- **Entry Preview** - Truncates long entries (200 chars) with "..." indicator
- **Responsive Layout** - Flexbox stacking on mobile devices

---

## 🚀 Deployment on Railway

**Platform:** Railway.app  
**Build System:** Maven (auto-detected)  
**Build Command:** `mvn clean package`  
**Runtime:** Java 21  
**Port:** 8080

**Deployment Steps:**
1. Push code to GitHub
2. Connect Railway to GitHub repo
3. Railway auto-detects Spring Boot → builds & deploys
4. Live URL generated automatically

---

## 🔮 Future Enhancements

🎯 **Planned Features:**
- User authentication & login system
- Database persistence (PostgreSQL/MySQL)
- Entry search & filtering functionality
- Data export (PDF/CSV)
- Social sharing capabilities
- Dark mode toggle
- Calendar view of entries
- AI-powered sentiment analysis
- Email reminders for journaling

---

## 📁 File Highlights

| File | Purpose |
|------|---------|
| `DemoApplication.java` | Spring Boot entry point |
| `JournalController.java` | Request routing & form handling |
| `JournalEntry.java` | Data model with JPA annotations |
| `JournalRepo.java` | Spring Data repository interface |
| `index.html` | Main journaling form page |
| `entry.html` | Entry detail view |
| `pom.xml` | Maven dependencies & build config |

---

## 📞 Contact & Links

- **GitHub Repository:** [spring-boot-project](https://github.com/anshumalapandit/spring-boot-project)
- **Live Application:** [spring-boot-project-production-1a4b.up.railway.app](https://spring-boot-project-production-1a4b.up.railway.app)

---

## 📄 License

This project is open source and available for educational purposes.

---

**Built with ❤️ using Spring Boot | Deployed on Railway | Designed with CSS3**
