
import "./App.css";

function App() {
  return (
    <main className="app">
      <header className="header">
        <h1>IntervenPro</h1>
        <span>Field Service Management</span>
      </header>

      <section className="welcome">
        <p className="eyebrow">Welcome to IntervenPro</p>
        <h2>Manage field operations efficiently.</h2>
        <p>
          Your workspace for customers, technicians,
          equipment and maintenance interventions.
        </p>

        <div className="status">
          <span className="status-dot" />
          Frontend running successfully
        </div>
      </section>
    </main>
  );
}

export default App;
