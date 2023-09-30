using System.Text;

namespace WorldGuessApplication {
    public partial class Form1 : Form {
        public Form1() {
            InitializeComponent();
        }

        String Word = "";
        private void Form1_Load(object sender, EventArgs e) {
            WrongGuess.Text = "";
            Word = "Hello World";
            StringBuilder Filter = new StringBuilder(Word);
            SetFilter(Filter);
            FilteredWord.Text = Filter.ToString();
        }
        private void GuessBtn_Click(object sender, EventArgs e) {
            String Input = UserInput.Text;
            bool IsMatches = Input.ToUpper().Equals(Word.ToUpper());
            String message = IsMatches ? "Correct Guess!" : "Wrong Guess!\nTry Again.";
            if (!IsMatches) {
                WrongGuess.AppendText(String.Format($"{Input}{Environment.NewLine}"));
                WrongGuess.ScrollToCaret();
            }
            MessageBox.Show(message);
            UserInput.Text = "";
        }
        private void SetFilter(StringBuilder Filter) {
            for (int i = 1; i < Filter.Length - 1; i++) {
                if (Filter[i] == ' ') {
                    continue;
                }
                Filter[i] = '?';
            }
        }
    }
}