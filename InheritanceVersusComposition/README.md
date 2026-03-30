# Inheritance vs Composition (Java Examples)

This repository contains minimal Java examples used in a lecture to illustrate the difference between **inheritance** and **composition**.

---

## 📁 Project Structure

```text
src/examples/
├── inheritance/                 # Basic inheritance hierarchy
├── composition/                # Basic composition-based design
├── inheritanceconfigurator/    # Rigid configuration using inheritance
└── compositionconfigurator/    # Flexible configuration using composition
```

---

## ▶️ How to Run (VS Code)

1. Open the project folder in **VS Code**

2. Make sure you have the **Java Extension Pack** installed

3. Navigate to one of the `Main.java` files:

   * `src/examples/compositionconfigurator/Main.java`
   * `src/examples/inheritanceconfigurator/Main.java`

4. Click **▶ Run** (top right)
   or right-click → **Run Java**

---

## ⚙️ Notes

* The project is already configured with:

  * `src` as source root
  * `bin` as output folder
* No manual compilation is required

---

## 💡 Key Takeaway

* **Inheritance** → fixed structure, harder to extend
* **Composition** → flexible, reusable, and preferred in most real systems

---

## 🧠 Lecture Context

These examples are intentionally minimal to highlight one core idea:

> Build systems from components (composition) rather than rigid hierarchies (inheritance).

