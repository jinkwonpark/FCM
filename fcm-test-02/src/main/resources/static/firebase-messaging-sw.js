importScripts('https://www.gstatic.com/firebasejs/5.9.2/firebase-app.js');
importScripts('https://www.gstatic.com/firebasejs/5.9.2/firebase-messaging.js');

// Initialize Firebase
let firebaseConfig = {
    apiKey: "AIzaSyBxPVRnOX-SaklikO3p03ORwVdX7gTvS-I",
    authDomain: "fcmtest-ce186.firebaseapp.com",
    projectId: "fcmtest-ce186",
    storageBucket: "fcmtest-ce186.appspot.com",
    messagingSenderId: "594237624524",
    appId: "1:594237624524:web:59056d9acd492e051db269",
    measurementId: "G-HMXHQM84XG"
};
firebase.initializeApp(firebaseConfig);
const messaging = firebase.messaging();