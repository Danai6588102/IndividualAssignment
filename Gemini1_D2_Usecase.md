
# Use Case Diagram for Gemini System
![Use Case Diagram](./Gemini1_Usecase.png)

## Use Cases Explanation

### Actor : Astronomer  
1. **Submit Observing Programs**  
Astronomers can create, edit, and submit observing programs that define targets, observation sequences, and instrument configurations. Then, the system validates submissions to prevent errors.<br>  

2. **Monitor Telescope and Instrument Status**  
Astronomers can monitor the status to ensure that observing conditions align with their program goals. This includes tracking system performance, instrument readiness, and environmental factors like weather conditions.<br>  

3. **Receive Observation Updates**  
The system provides astronomers with live updates on the progress of their observations, including image acquisition status, system performance, and any modifications.<br>  

4. **Receive Automated Notifications**  
If an observation schedule changes due to weather conditions, system faults, or priority adjustments, astronomers receive instant notifications via email, SMS, or system alerts.<br>  

5. **Visualize Real-Time Observational Data**  
Astronomers can preview images and data being collected, such as raw images and signal-to-noise ratios, allowing them to assess observation quality in real-time.<br>  

6. **Analyze Data Quality**  
The system provides tools to analyze observational data, including sky brightness, image focus, and exposure times, ensuring high-quality results before final storage.<br>  

7. **Generate and Download Observation Reports**  
Astronomers can generate structured reports summarizing observations, system performance, and encountered issues, with options to download them in formats like PDF or CSV.<br>  

8. **Collaborate with Other Users via Communication Tools**  
The system includes chat, video, and annotation tools to facilitate collaboration between astronomers, telescope operators, and science observers.<br>  

9. **View and Manage Scheduled Observations**  
Astronomers can review upcoming and completed observations, modify schedules if needed, and prioritize certain observations based on real-time conditions.<br>  

10. **Download Observational Data**  
Once observations are complete, astronomers can download data in standard formats like FITS for further analysis or archival purposes.<br>  

11. **Validate Observing Program Submission**  
When an astronomer submits an observing program, the system verifies target visibility, instrument settings, and schedule constraints to prevent errors. If issues are detected, the astronomer is prompted to revise the submission before approval.<br>  

### Actor : Science Observer  
1. **Monitor Data Acquisition in Real-Time**  
Science observers can oversee the telescope’s data collection process, ensuring that the system captures observations as expected.<br>  

2. **Validate Observational Data Integrity**  
Observers can review incoming data for errors, inconsistencies, or missing information, helping maintain scientific accuracy.<br>  

3. **Analyze Data Quality**  
The system provides analysis tools for observers to evaluate image quality, sky conditions, and instrument settings.<br>  

4. **View Observation Sequences and Instrument Configurations**  
Observers can check detailed observation parameters, including exposure times, filters, and camera settings.<br>  

5. **Collaborate with Other Users via Communication Tools**  
The system includes chat, video, and annotation tools to facilitate collaboration between astronomers, telescope operators, and science observers.<br>  

6. **Receive Observation Updates**  
Science observers get real-time updates on observations, ensuring data quality and alerting them to issues.<br>  

7. **Receive Automated Notifications**  
The system alerts observers about issues like hardware failures or environmental changes, ensuring rapid response.<br>  

8. **Generate Session Reports**  
Observers can generate reports summarizing the session’s observational data, system performance, and any anomalies.<br>  

9. **Download Data for Further Analysis**  
Observers can retrieve observational data in formats like FITS for detailed post-processing and validation.<br>  

10. **Check Logs for Data Integrity**  
Observers can review system logs to verify that data acquisition processes ran smoothly and identify potential inconsistencies.<br>  

### Actor : Telescope Operator
1. **Control Telescope Movement and Positioning** <br>
Operators can adjust the telescope’s orientation, ensuring it accurately tracks celestial objects for observations.<br>

3. **Configure and Adjust Instrument Settings**<br>
Operators can fine-tune instrument settings, such as camera exposure, filter selection, and sensor sensitivity, to match observation requirements.<br>

4. **Switch Between Observing Instruments**<br>
The system allows seamless transitions between different instruments without disrupting active operations.<br>

5. **Prioritize Observing Programs**<br>
Based on scientific importance and real-time conditions, operators can adjust the priority of scheduled observations.<br>

6. **Execute and Manage Observing Programs**<br>
Operators are responsible for launching observing programs, they use automatic sequencing to execute observations, but they can manually intervene if needed.<br>

7. **Implement Automatic Sequencer for Scheduling**<br>
The system automates scheduling to optimize efficiency, but operators can manually adjust sequences when necessary.<br>

8. **Adjust Telescope Focus Settings**<br>
Operators can fine-tune the telescope’s focus to ensure sharp and clear images.<br>

9. **Monitor and Address System Faults**<br>
Operators continuously track system status and respond to issues like instrument malfunctions or software failures.<br>

10. **Detect and Respond to Hardware Failures**<br>
The system alerts operators to hardware issues, allowing them to take corrective actions or switch to backup systems.<br>

11. **Pause or Terminate Sessions Based on Weather Conditions**<br>
If weather conditions become unsafe (e.g., high humidity, strong winds), the system automatically halts operations, but operators can pause or end observing sessions to protect equipment in specific cases.<br>

12. **Access System Logs for Diagnostics**<br>
Logs provide detailed records of operations, errors, and performance metrics to aid troubleshooting.<br>

13. **Collaborate with Other Users via Communication Tools**<br>
The system includes chat, video, and annotation tools to facilitate collaboration between astronomers, telescope operators, and science observers.<br>

14. **Run System Tests and View Results**<br>
Operators can perform diagnostics to verify system functionality and identify potential issues.<br>

15. **Enter Maintenance Mode for Hardware/Software Diagnostics**<br>
Operators can switch the system to maintenance mode to perform repairs, updates, or calibration procedures.<br>

16. **Toggle Observing Modes**<br>
Operators can switch between different observation modes (e.g., interactive, queue-based, remote) without restarting the system.<br>

17. **Monitor Telescope and Instrument Status**<br>
Telescope Operators are responsible for real-time monitoring of the telescope’s operational health, positioning, and instrument configurations.<br>
They ensure proper functioning during observations and address system, calibration, or environmental issues.<br>

### Actor : Support Personnel
1. **Perform System Maintenance and Installation**<br>
Support personnel install and maintain telescope hardware and software components, ensuring optimal system performance. This includes setting up new instruments and replacing faulty components.<br>

2. **Diagnose and Resolve Hardware and Software Issues**<br>
When technical failures occur, support personnel troubleshoot and resolve issues related to hardware malfunctions, network failures, or software bugs.<br>

3. **Access System Logs for Debugging**<br>
Support personnel review system logs to analyze errors, track anomalies, and identify potential faults for resolution.<br>

4. **Run System Diagnostics and Regression Testing**<br>
To ensure ongoing reliability, they execute diagnostic tests and regression testing after system updates to prevent new issues from arising.<br>

5. **Implement Software Updates and Patches**<br>
Support personnel deploy software updates, patches, and security fixes to enhance system performance and protect against vulnerabilities.<br>

6. **Archive Observational Data Securely**<br>
They manage the secure archiving of observational data to ensure long-term accessibility and compliance with data retention policies.<br>

7. **Back Up Observational Data and Logs**<br>
Regular backups of scientific data and system logs help prevent data loss in case of failures or accidental deletions.<br>

8. **Manage System Faults and Alerts**<br>
Support personnel monitor system alerts and respond proactively to faults to minimize operational disruptions.<br>

9. **Configure Remote Access Permissions**<br>
They manage access permissions for remote users, ensuring secure and restricted entry to the system based on user roles.<br>

### Actor : Software Developer
1. **Design and Develop System Updates**<br>
Software developers design and implement new features, enhancements, and bug fixes to improve system functionality.<br>

2. **Perform System Integration Testing**<br>
They conduct tests to ensure that newly developed software components integrate seamlessly with existing systems.<br>

3. **Implement Incremental Software Upgrades**<br>
Developers roll out software updates in small, manageable increments to reduce downtime and prevent major disruptions.<br>

4. **Access and Modify Codebase**<br>
They review, update, and optimize the codebase to enhance performance, introduce new capabilities, and fix bugs.<br>

5. **Run Virtual Telescope Simulations for Testing**<br>
Before deploying changes, developers use virtual telescope simulations to test software performance under real-world conditions.<br>

6. **Manage Security Features**<br>
Developers implement authentication protocols, encryption mechanisms, and other security measures to protect sensitive data.<br>

7. **Debug and Fix Software Issues**<br>
When system errors occur, they diagnose the root cause, develop fixes, and ensure stability.<br>

8. **Implement and Monitor Performance Metrics**<br>
Developers track system performance using key metrics to identify areas that need optimization.<br>

9. **Maintain a Consistent User Interface (GUI & CLUI)** <br>
They ensure a consistent and user-friendly experience across graphical (GUI) and command-line (CLUI) interfaces.<br>

10. **Implement Multi-Factor Authentication (MFA)** <br>
To enhance security, they integrate multi-factor authentication, requiring additional verification beyond a password.<br>

11. **Monitor and Isolate Faults in Subsystems** <br>
Developers identify, isolate, and troubleshoot faults in specific subsystems to prevent system-wide failures.<br>

12. **Implement Software Updates and Patches** <br>
Software developers create updates and patches, assist with complex deployments, and ensure system compatibility through integration testing.<br>

### Actor : Administrator
1. **Manage Observation Schedules** <br>
Administrators oversee the scheduling of observations, ensuring fair allocation of telescope time and avoiding conflicts.<br>

2. **Allocate System Resources** <br>
They optimize computing, storage, and networking resources to maintain system efficiency and support multiple users.<br>

3. **Oversee Maintenance Downtime** <br>
Administrators coordinate maintenance windows, ensuring minimal disruption to scheduled observations.<br>

4. **Modify System Configuration Settings** <br>
They adjust system settings, including network configurations, telescope parameters, and user access policies.<br>

5. **Enforce User Role-Based Access Controls** <br>
Administrators define user roles and permissions to ensure data security and prevent unauthorized access.<br>

6. **Archive and Retrieve Observational Data**<br> 
They manage long-term data storage, ensuring compliance with archival policies and providing retrieval access when needed.<br>

7. **Generate Audit Logs for Security Compliance** <br>
Administrators generate and review security logs to detect potential breaches and maintain compliance with regulations.<br>

8. **Manage User Accounts and Permissions** <br>
They create, update, and deactivate user accounts while ensuring appropriate access privileges.<br>

9. **Oversee System Scalability for Multiple Telescopes** <br>
Administrators ensure that the system can scale to accommodate multiple telescopes and growing data demands.<br>

10. **Monitor and Enforce Data Privacy Standards** <br>
They enforce privacy policies to protect sensitive observational data and comply with ethical guidelines.<br>

11. **Implement Secure Login Mechanisms** <br>
Secure authentication mechanisms, such as encrypted logins and two-factor authentication, are managed by administrators.<br>

12. **Monitor Real-Time Dashboard of All Subsystems** <br>
They track system health through a real-time dashboard displaying telescope, network, and data acquisition statuses.<br>

13. **Restrict Certain Operations for Remote Users** <br>
Administrators limit the actions remote users can perform, such as pausing observations or accessing high-risk settings.<br>
