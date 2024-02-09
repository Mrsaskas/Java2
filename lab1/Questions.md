
---
__Лабораторна Робота №1__

_Стельник Антон ТЗ-12_

---

1. **Призначення JFC фреймворку і його архітектура:**
   JFC (Java Foundation Classes) - це фреймворк для побудови графічних інтерфейсів користувача в мові програмування Java. Архітектура JFC включає в себе Swing (для створення GUI), Abstract Window Toolkit (AWT), Java 2D (робота з 2D графікою) і Java Accessibility API (доступність).

2. **Переваги графічної бібліотеки Swing у порівнянні з бібліотекою AWT:**
   - Swing є легшим і швидшим, оскільки використовує власні компоненти, а не залежить від нативних.
   - Swing має більш розширений і сучасний набір компонентів.
   - Swing підтримує легше властивості Look and Feel (зовнішній вигляд).
   - Можливість використовувати легко змінювані (mutable) об'єкти.

3. **Приклад структури GUI програми на Java:**
   ```java
   import javax.swing.*;
   
   public class MyGUIApplication {
       public static void main(String[] args) {
           // Створення головного вікна
           JFrame frame = new JFrame("Моя GUI програма");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           // Створення панелі
           JPanel panel = new JPanel();
           
           // Додавання компонентів до панелі
           JButton button = new JButton("Натисни мене");
           JLabel label = new JLabel("Введіть текст:");
           JTextField textField = new JTextField(20);
           
           panel.add(label);
           panel.add(textField);
           panel.add(button);
           
           // Додавання панелі до вікна
           frame.getContentPane().add(panel);
           
           // Налаштування розмірів та відображення вікна
           frame.setSize(300, 200);
           frame.setVisible(true);
       }
   }


- Створюється головне вікно.
- Створюється панель для розміщення компонентів.
- Створюються та додаються компоненти (кнопка, мітка, текстове поле) на панель.
- Панель додається до вмісту вікна.
- Налаштовуються розміри та відображення вікна.


### 4. Containers в Awt/Swing

Containers в Awt/Swing використовуються для групування та розміщення компонентів (Widgets) у вікні. Їх призначення включає:

- **`Frame` (рамка):** Основний контейнер для створення вікна.
- **`Panel` (панель):** Використовується для групування компонентів.
- **`Dialog` (діалог):** Вікно для виведення повідомлень або отримання введення від користувача.
- **`ScrollPane` (прокрутка):** Контейнер для вміщення області прокрутки та її вмісту.
- **`Container` (контейнер):** Базовий клас для інших контейнерів, може містити інші компоненти.

### 5. Основні методи класу Frame

```java
// Створення об'єкта Frame
Frame frame = new Frame("Заголовок");

// Додавання компонента до Frame
frame.add(component);

// Встановлення розмірів вікна
frame.setSize(width, height);

// Встановлення видимості вікна
frame.setVisible(true);

// Обробка події закриття вікна
frame.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
});

```
6. **Призначення об'єкта Panel:**
   Об'єкт Panel використовується для створення контейнера, який може містити інші компоненти Swing. Він допомагає групувати компоненти разом.

   **Додавання компонентів до Panel:**
   Використовуючи метод `add(Component comp)`, можна додати компоненти до Panel. Наприклад:

   ```java
   Panel panel = new Panel();
   JButton button = new JButton("Click me");
   panel.add(button);
   ```



 7. **Призначення об'єктів типу event в пакеті java.awt.event:**
   Об'єкти типу event в пакеті `java.awt.event` використовуються для обробки подій (events) у графічних інтерфейсах користувача. Наприклад, події миші, клавіатури та інші.

    **Механізм оброблення подій в AWT/Swing:**
   В AWT та Swing механізм оброблення подій базується на використанні "слухачів" (listeners). Об'єкти, які хочуть реагувати на певні події, реалізують відповідні інтерфейси слухачів. Коли відбувається подія, спеціальний об'єкт події (наприклад, MouseEvent або ActionEvent) створюється та передається всім зареєстрованим слухачам.

   Наприклад, для обробки події натискання кнопки в Swing використовується ActionListener:

   ```java
   JButton button = new JButton("Натисни мене");
   button.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Код, який виконується при натисканні кнопки
       }
   });
```
8. **Призначення інтерфейсів типу XxxListener. Типи інтерфейсів. Приклади використання:**

   - **ActionListener:** Використовується для оброблення подій взаємодії з компонентами, такими як кнопки.
   
     ```java
     JButton button = new JButton("Click me");
     button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             // Код, який виконується при натисканні кнопки
         }
     });
     ```

   - **MouseListener:** Використовується для оброблення подій миші, таких як натискання чи відпускання кнопок миші.

     ```java
     Component component = new Component();
     component.addMouseListener(new MouseListener() {
         @Override
         public void mouseClicked(MouseEvent e) {
             // Обробка події кліку мишею
         }

         // Реалізація інших методів інтерфейсу
     });
     ```

   - **KeyListener:** Використовується для оброблення подій клавіатури, таких як натискання чи відпускання клавіш.

     ```java
     JTextField textField = new JTextField();
     textField.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {
             // Обробка події натискання клавіші
         }

         // Реалізація інших методів інтерфейсу
     });
     ```