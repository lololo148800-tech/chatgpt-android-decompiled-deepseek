package p590Y4;

import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p444S4.C7011q;
import p566X4.C9046d;
import p613Z4.AbstractC10159f;
import p658b5.C11245p;

/* JADX INFO: renamed from: Y4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9649f extends AbstractC9647d {

    /* JADX INFO: renamed from: c */
    public static final String f29076c;

    /* JADX INFO: renamed from: b */
    public final int f29077b;

    static {
        String strM7409f = C7011q.m7409f("NetworkNotRoamingCtrlr");
        AbstractC16544l.m18093f(strM7409f, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f29076c = strM7409f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9649f(AbstractC10159f tracker) {
        super(tracker);
        AbstractC16544l.m18094g(tracker, "tracker");
        this.f29077b = 7;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: a */
    public final int mo10225a() {
        return this.f29077b;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: b */
    public final boolean mo10226b(C11245p c11245p) {
        return c11245p.f34050j.f22392a == 4;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: c */
    public final boolean mo10227c(Object obj) {
        C9046d value = (C9046d) obj;
        AbstractC16544l.m18094g(value, "value");
        int i10 = Build.VERSION.SDK_INT;
        boolean z6 = value.f27617a;
        if (i10 < 24) {
            C7011q.m7408d().m7410a(f29076c, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (z6) {
                return false;
            }
        } else if (z6 && value.f27620d) {
            return false;
        }
        return true;
    }
}
