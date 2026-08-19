package p1073w3;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: w3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C20814p {

    /* JADX INFO: renamed from: a */
    public Message f66099a;

    /* JADX INFO: renamed from: a */
    public final void m21373a() {
        this.f66099a = null;
        ArrayList arrayList = C20815q.f66100b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21374b() {
        Message message = this.f66099a;
        message.getClass();
        message.sendToTarget();
        m21373a();
    }
}
