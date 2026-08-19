package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p282L4.C4933a;
import p282L4.InterfaceC4934b;
import p374P5.C6358k;
import p468T2.C7218j;
import p468T2.C7226r;
import p720e6.C13288c;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC4934b {
    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: a */
    public final List mo5546a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p282L4.InterfaceC4934b
    /* JADX INFO: renamed from: b */
    public final Object mo5547b(Context context) {
        C13288c c13288c = new C13288c();
        c13288c.f42001Y = context.getApplicationContext();
        C7226r c7226r = new C7226r(c13288c);
        c7226r.f5517a = 1;
        if (C7218j.f22895k == null) {
            synchronized (C7218j.f22894j) {
                try {
                    if (C7218j.f22895k == null) {
                        C7218j.f22895k = new C7218j(c7226r);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m11732c(context);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: c */
    public final void m11732c(Context context) {
        Object objM5545b;
        C4933a c4933aM5543c = C4933a.m5543c(context);
        c4933aM5543c.getClass();
        synchronized (C4933a.f16102e) {
            try {
                objM5545b = c4933aM5543c.f16103a.get(ProcessLifecycleInitializer.class);
                if (objM5545b == null) {
                    objM5545b = c4933aM5543c.m5545b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC11105n abstractC11105nMo7809i = ((InterfaceC11112u) objM5545b).mo7809i();
        abstractC11105nMo7809i.mo7806a(new C6358k(this, abstractC11105nMo7809i));
    }
}
