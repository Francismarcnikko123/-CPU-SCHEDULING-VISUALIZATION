# -CPU-SCHEDULING-VISUALIZATION
PROJECT 01

Member: 
Nombrado, John Cale N.
Diwa, Francis Marc Nikko G.

Contributions:

Nombrado (MLD-jc):

- Integrated the CPU algorithms to the dynamic UI to have real time visualization
- Implemented a color scheme for the FIFO, SJF, SRTF, RR to have an indicator in gnatt chart like when the process is running it indicates as yellow and if it's already done it's cyan
- Finalized the MLFQ and RR to be in sync with the other UI components and to have real time visualization
- Added an indicator to MLFQ in the gnatt chart where it shows the highest priority and the lowest (This is only for the MLFQ algorithm since it has quequing priorities)
- Implemented a queue panel based of the algorithms process when running in each algorithms (depends on what the user want's to select) shows the process next queue
- Added the simulation speed where user can adjust the sim speed of the process during it's execution or before the user enters run to execute the process 

Diwa (Francismarcnikko123):

- Implemented RR and MLFQ


PROJECT OVERVIEW: 

With the help of Swing, this project, a Java-based CPU Scheduling Simulator, enables users to view and work with well-known scheduling methods. The Multilevel Feedback Queue (MLFQ), Round Robin, SRTF (Preemptive), SJF (Non-Preemptive), and FIFO algorithms are all supported by the simulator.

Users can choose a scheduling algorithm from a dropdown menu and manually enter the number of processes, their arrival time, and their burst time. The simulator asks the user to enter parameters before the algorithm is executed for algorithms that need further configuration, such as MLFQ (quantum and allotment time per queue level) and Round Robin (time quantum).

Instructions on how to run the simulation:

1. Execute the project
2. After executing you will see this:
<img width="1123" height="531" alt="Screenshot 2025-07-12 at 12 56 55 PM" src="https://github.com/user-attachments/assets/d0a5f2fd-8fb4-42ee-af0e-467a87c736d2" />
3.) 



