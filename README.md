# -CPU-SCHEDULING-VISUALIZATION
PROJECT 01

Member: 
Nombrado, John Cale N.
Diwa, Francis Marc Nikko G.

Contributions:

Nombrado (MLD-jc):

- Designed the UI
- Integrated the CPU algorithms to the dynamic UI to have real time visualization
- Implemented a color scheme for the FIFO, SJF, SRTF, RR to have an indicator in gnatt chart like when the process is running it indicates as yellow and if it's already done it's cyan
- Finalized the MLFQ and RR to be in sync with the other UI components and to have real time visualization
- Added an indicator to MLFQ in the gnatt chart where it shows the highest priority and the lowest (This is only for the MLFQ algorithm since it has quequing priorities)
- Implemented a queue panel with real time visualization of the algorithms process when running in each algorithms shows the process of the next queue
- Added the simulation speed where user can adjust the sim speed of the process during it's execution or before the user enters run to execute the process 

Diwa (Francismarcnikko123):

- Implemented RR and MLFQ

PROJECT OVERVIEW: 

With the help of Swing in java apache netbeans, this project, a Java-based CPU Scheduling Visualizer, enables users to view and work with well-known scheduling methods. The Multilevel Feedback Queue (MLFQ), Round Robin, SRTF (Preemptive), SJF (Non-Preemptive), and FIFO algorithms are all supported by the simulator.

Users can choose a scheduling algorithm from a dropdown menu and manually enter the number of processes, their arrival time, and their burst time. The simulator asks the user to enter parameters before the algorithm is executed for algorithms that need further configuration, such as MLFQ (quantum and allotment time per queue level) and Round Robin (time quantum).

Instructions on how to run the simulation:

1. Execute the project
2. After executing you will see this:
<img width="1123" height="531" alt="Screenshot 2025-07-12 at 12 56 55 PM" src="https://github.com/user-attachments/assets/d0a5f2fd-8fb4-42ee-af0e-467a87c736d2" />
3.) You can select between the five algorithms that are implmented (FIFO, SJF, and SRTF) does not required allotment time and Queue priority input, it's only for MLFQ and RR. 
<img width="1123" height="513" alt="Screenshot 2025-07-13 at 3 27 03 PM" src="https://github.com/user-attachments/assets/03bc1b5a-85cd-4feb-ae2e-1eed808e920d" />
4.) Example of FIFO, SJF, and SRTF outputs: (In this screenshot, I only use the FIFO but when executing the program you can select any algorithm you want to run the process with)
<img width="1132" height="550" alt="Screenshot 2025-07-13 at 3 30 24 PM" src="https://github.com/user-attachments/assets/eb8ae3c7-7237-4c2a-8672-68d6d609550a" />
<img width="1124" height="527" alt="Screenshot 2025-07-13 at 3 31 32 PM" src="https://github.com/user-attachments/assets/b9aa014e-e333-4971-9527-cad3d2f72b66" />
5.) Example of RR when running the selected algorithm: (After you input how many process you want, it will then ask for the time quantum which is the time slice)
<img width="1129" height="533" alt="Screenshot 2025-07-13 at 3 33 14 PM" src="https://github.com/user-attachments/assets/ca231a48-8284-4aa3-8669-4a60779863db" />
<img width="1124" height="520" alt="Screenshot 2025-07-13 at 3 33 32 PM" src="https://github.com/user-attachments/assets/b51d231f-f8c9-4f43-9841-3a8cf6a49030" />
<img width="1128" height="526" alt="Screenshot 2025-07-13 at 3 33 58 PM" src="https://github.com/user-attachments/assets/88691700-d14f-4f0d-b849-857ceaa26ef2" />
<img width="1123" height="534" alt="Screenshot 2025-07-13 at 3 34 59 PM" src="https://github.com/user-attachments/assets/ab5ad179-4816-4242-a6c9-d788674167e6" />
6.) Example of MLFQ: "After you input how many process you want, it will ask for the time slice and the allotment time for each queue (Q0,Q1,Q2,Q3, you need to press the run button a couple times for it to ask and the final click will execute the process after you input the necessary information)
<img width="1129" height="525" alt="Screenshot 2025-07-13 at 3 54 39 PM" src="https://github.com/user-attachments/assets/be1dae4d-d3f1-49ed-a195-70187c6ce94a" />
<img width="1137" height="524" alt="Screenshot 2025-07-13 at 3 55 10 PM" src="https://github.com/user-attachments/assets/d8d7d5ba-d2ae-42de-8b81-cce80e8cbb3a" />
<img width="1129" height="529" alt="Screenshot 2025-07-13 at 3 55 33 PM" src="https://github.com/user-attachments/assets/06a49e1d-3b64-4ff3-b961-c31a2712865f" />
<img width="1122" height="533" alt="Screenshot 2025-07-13 at 3 55 56 PM" src="https://github.com/user-attachments/assets/fa1b5f12-1c3d-4015-a8b0-969ddc5e0149" />
<img width="1120" height="538" alt="Screenshot 2025-07-13 at 3 57 03 PM" src="https://github.com/user-attachments/assets/8c52b848-f3d7-4d90-956b-4c8ffe0d4781" />


Note: In RR and MLFQ since it ask for the time slice and allotment time, you have to press run button first before executing the process.

SHORT DESCRIPTION OF THE ALGORITHMS THAT ARE IMPLEMENTED: 

1.) FCFS/FIFO (First Come, First Serve/ First in, First out):
- Non preemptive scheduling algorithm
- Process are executed in the order of their arrival time
- It's simple but it may cause long waiting times for short jobs stuck behind long ones which you call a convoy effect
2. SJF (Short Job First):
3. SRTF (
4. RR (Round Robin): 
5. MLFQ




