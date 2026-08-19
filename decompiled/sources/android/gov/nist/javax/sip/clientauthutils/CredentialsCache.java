package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p713e.InterfaceC13232h;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class CredentialsCache {
    private ConcurrentHashMap<String, List<InterfaceC13232h>> authorizationHeaders = new ConcurrentHashMap<>();
    private SipTimer timer;

    public class TimeoutTask extends SIPStackTimerTask {
        String callId;
        String userName;

        public TimeoutTask(String str, String str2) {
            this.callId = str2;
            this.userName = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            CredentialsCache.this.authorizationHeaders.remove(this.callId);
        }
    }

    public CredentialsCache(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    public void cacheAuthorizationHeader(String str, InterfaceC13232h interfaceC13232h, int i10) {
        String username = interfaceC13232h.getUsername();
        if (str == null) {
            throw new NullPointerException("Call ID is null!");
        }
        List<InterfaceC13232h> linkedList = this.authorizationHeaders.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.authorizationHeaders.put(str, linkedList);
        } else {
            String realm = interfaceC13232h.getRealm();
            ListIterator<InterfaceC13232h> listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                if (realm.equals(listIterator.next().getRealm())) {
                    listIterator.remove();
                }
            }
        }
        linkedList.add(interfaceC13232h);
        TimeoutTask timeoutTask = new TimeoutTask(str, username);
        if (i10 != -1) {
            this.timer.schedule(timeoutTask, i10 * 1000);
        }
    }

    public Collection<InterfaceC13232h> getCachedAuthorizationHeaders(String str) {
        if (str != null) {
            return this.authorizationHeaders.get(str);
        }
        throw new NullPointerException("Null arg!");
    }

    public void removeAuthenticationHeader(String str) {
        this.authorizationHeaders.remove(str);
    }
}
