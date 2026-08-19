package p590Y4;

import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p566X4.C9046d;
import p613Z4.AbstractC10159f;
import p658b5.C11245p;

/* JADX INFO: renamed from: Y4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9648e extends AbstractC9647d {

    /* JADX INFO: renamed from: c */
    public static final String f29074c;

    /* JADX INFO: renamed from: b */
    public final int f29075b;

    static {
        String strM7409f = C7011q.m7409f("NetworkMeteredCtrlr");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f29074c = strM7409f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9648e(AbstractC10159f tracker) {
        super(tracker);
        AbstractC16544l.m18094g(tracker, "tracker");
        this.f29075b = 7;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: a */
    public final int mo10225a() {
        return this.f29075b;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: b */
    public final boolean mo10226b(C11245p c11245p) {
        return c11245p.f34050j.f22392a == 5;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: c */
    public final boolean mo10227c(Object obj) {
        C9046d value = (C9046d) obj;
        AbstractC16544l.m18094g(value, "value");
        int i10 = Build.VERSION.SDK_INT;
        boolean z6 = value.f27617a;
        if (i10 < 26) {
            C7011q.m7408d().m7410a(f29074c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z6) {
                return false;
            }
        } else if (z6 && value.f27619c) {
            return false;
        }
        return true;
    }
}
