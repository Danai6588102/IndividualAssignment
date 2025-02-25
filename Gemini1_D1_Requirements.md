**Functional and Non-functional requirements**<br>
**Functional Requirements**<br>
1. The system must allow users to create, edit, validate, and submit observing programs.<br>
2. Users must be able to specify targets, observation sequences, and instrument configurations in observing programs.<br>
3. The system should validate observing programs for errors (e.g., target visibility or configuration conflicts).<br>
4. The system shall control the Gemini telescopes and associated instruments for astronomical data acquisition.<br>
5. The system must allow real-time control of telescope movement, positioning, and focus settings.<br>
6. The system should provide a graphical interface to manage and monitor instrument settings (e.g., filters, cameras).<br>
7. Users must be able to switch between observing instruments and configure them without disrupting ongoing operations.<br>
8. The system shall support observing modes including interactive, queue-based, remote operations, and service.<br>
9. Users should be able to toggle between observing modes without restarting the system.<br>
10. The system must enable dynamic scheduling and reordering of queued observations based on real-time conditions (e.g., weather changes).<br>
11. Telescope operators should be able to prioritize observing programs based on predefined criteria (e.g., scientific importance, weather sensitivity).<br>
12. The system shall implement an automatic sequencer for observation scheduling and execution.<br>
13. Users must receive automated notifications if their observing schedule is modified.<br>
14. The system must capture and store astronomical data in the FITS format.<br>
15. The system shall store data using lossless compression for efficient storage and transmission.<br>
16. The system shall archive observational data in a central system with redundancy.<br>
17. The system must collect and store observational data (e.g., raw images, metadata, system logs) in a central repository.<br>
18. Users must be able to download data in standard formats (e.g., FITS files).<br>
19. The system shall provide quick access to the last three days of data for quality assessment.<br>
20. The system should automatically back up all observational data and logs to a secure location.<br>
21. Users must be able to visualize observational data in real time during acquisition (e.g., preview images, signal-to-noise ratios).<br>
22. The system should provide tools to analyze data quality (e.g., sky brightness, image focus) directly within the interface.<br>
23. The system shall support remote observing and control with team collaboration across multiple locations.<br>
24. The system shall restrict specific operations to authorized remote sites based on user privileges.<br>
25. The system shall include real-time video and voice communication capabilities for remote operators.<br>
26. Remote users should be able to collaborate with on-site staff through integrated communication tools (e.g., chat or video).<br>
27. The system must detect faults (e.g., hardware failures, configuration issues) and alert users in real time.<br>
28. Users should receive detailed error messages with suggested troubleshooting steps.<br>
29. The system shall allow users to monitor operations without affecting ongoing activities.<br>
30. The system shall include both graphical user interfaces (GUIs) and command-line user interfaces (CLUIs).<br>
31. Users must be able to perform and schedule instrument calibrations (e.g., flat fields, dark frames).<br>
32. The system shall support dynamic reconfiguration of instruments without disrupting ongoing operations.<br>
33. The system should validate and store calibration data for future use.<br>
34. The system shall include built-in test facilities for diagnostics and regression testing.<br>
35. The system must allow operators to switch to maintenance mode to perform hardware and software diagnostics.<br>
36. Users should be able to run system tests and view test results within the interface.<br>
37. Multiple users must be able to work on the same observing program simultaneously, with real-time updates.<br>
38. Team members should be able to share comments, annotations, and observations within the system.<br>
39. The system should generate session reports summarizing observations, system performance, and encountered issues.<br>
40. Users must be able to export reports in standard formats (e.g., PDF, CSV).<br>
41. The system must provide a dashboard to monitor the status of all subsystems (e.g., telescope, instruments, weather sensors).<br>
42. All user actions and system events must be logged with timestamps and user IDs for auditing.<br>
43. The system must integrate with weather sensors to provide real-time updates (e.g., wind speed, humidity, cloud coverage).<br>
44. Observing sessions must automatically pause or terminate if unsafe weather conditions are detected (e.g., high humidity).<br>
45. The system should send automated email or SMS alerts for critical events (e.g., system faults, weather changes).<br>
46. The interface should support multiple languages (e.g., English, Spanish) for international users.<br>
47. Date and time formats must adapt to user preferences based on location or role.<br>
48. The system must provide tools for developing executable observing programs with minimal complexity.<br>
49. The system must notify users of faults with detailed descriptions and log the issues for diagnostics.<br>
50. The system must include a virtual telescope simulator for program testing and validation.<br>

**Non-Functional Requirements**<br>
1. The system shall respond to subsystem commands within 100–200 milliseconds to signal acceptance.<br>
2. The system shall support command timeouts of approximately 500 milliseconds for delayed replies.<br>
3. The system shall provide immediate updates when changing observing modes or submitting commands.<br>
4. The system shall deliver real-time feedback for schedule adjustments and subsystem status changes.<br>
5. The system shall minimize delays for remote users while prioritizing critical data transmission.<br>
6. The system shall handle up to 100 transactions per second (TPS) during peak operations without performance degradation.<br>
7. The system shall support real-time resequencing of queued observations.<br>
8. The system shall enable flexible scheduling with minimal delays to users.<br>
9. The system shall provide immediate notifications of faults, including detailed logs for quick diagnosis.<br>
10. The system shall include redundant components to minimize the impact of hardware or software failures.<br>
11. The system shall automatically detect and notify users of faults as they arise.<br>
12. The system shall centralize error logs and categorize them into Fatal, Serious, and Warning levels.<br>
13. The system shall monitor warning message rates to detect maintenance needs proactively.<br>
14. The system shall ensure that critical data has at least two copies stored to maintain integrity and availability.<br>
15. The system shall maintain high availability to prevent interruptions during scheduled observation windows.<br>
16. The system shall support automated startup and shutdown procedures for telescopes and instruments.<br>
17. The system shall allow quick reconfiguration to adapt to different observing environments.<br>
18. The system shall provide full remote access capabilities for monitoring, diagnostics, and observing.<br>
19. The system shall include intuitive and visual tools for object selection, scheduling, and monitoring.<br>
20. The system shall allow users to submit, modify, and resequence observation commands in real time.<br>
21. The system shall support remote operational capabilities with a consistent user experience.<br>
22. The system shall provide a simple and intuitive interface, particularly for non-technical users.<br>
23. The system shall group user controls for convenience and clarity.<br>
24. The system shall have a uniform design across all subsystems, adapting the “look-and-feel” based on user roles.<br>
25. The system shall offer role-based access controls, with different privileges for astronomers, science observers, and operators.<br>
26. The system shall provide clear feedback for errors, including logs and actionable steps to resolve issues.<br>
27. The system shall include a virtual simulation environment for training astronomers and staff.<br>
28. The system shall implement secure login mechanisms for user authentication.<br>
29. The system shall support multi-factor authentication (MFA) for sensitive roles.<br>
30. The system shall protect sensitive data by encrypting it during transmission.<br>
31. The system shall isolate faults between subsystems to prevent cascading failures.<br>
32. The system shall log security-related errors and warnings, such as unauthorized access attempts.<br>
33. The system shall dynamically restrict certain operations based on the remote location of the user.<br>
34. The system shall adhere to operational, data privacy, and resilience standards defined by AURA and other relevant authorities.<br>
35. The system shall securely archive observational data and logs with a defined policy for retention and access.<br>
36. The system shall maintain comprehensive logs of all user activities, system events, and errors for auditing and troubleshooting.<br>
37. The system shall support a software architecture that allows incremental upgrades without disrupting operations.<br>
38. The system shall manage multiple telescopes and instruments to ensure scalability.<br>
39. The system shall accommodate emerging observation techniques, such as multi-messenger astronomy.<br>

**Actors and Users’ Scenarios**<br>
1.Astronomer:<br>
- Astronomers can interact with the system to execute observing programs.<br>
- Astronomers can monitor the status of telescopes and instruments in real-time.<br>
- Astronomers cannot directly control the telescope but can submit commands via the scheduler.<br>

2.Science Observer:<br>
- Science observers can monitor data acquisition and validate its integrity.<br>
- Science observers can ensure that the system operates according to the observing program.<br>

3.Telescope Operator:<br>
- Telescope operators can directly control telescopes and instruments during observations.<br>
- Telescope operators can monitor and address system faults during operations.<br>

4.Support Personnel:<br>
- Support personnel can access the system for maintenance, installation, and configuration changes.<br>
- Support personnel can perform diagnostics and resolve hardware or software issues.<br>

5.Software Developer:<br>
- Software developers can access and modify the system to design, test, and deploy updates.<br>
- Software developers can perform system integration and regression testing.<br>

6.Administrator:<br>
- Administrators can manage observation schedules and allocate system resources.<br>
- Administrators can oversee maintenance downtime and system modifications.<br>
