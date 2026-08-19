package p590Y4;

import android.os.Build;
import kotlin.jvm.internal.AbstractC16544l;
import p566X4.C9046d;
import p613Z4.AbstractC10159f;
import p613Z4.C10154a;
import p658b5.C11245p;

/* JADX INFO: renamed from: Y4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9644a extends AbstractC9647d {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f29066b;

    /* JADX INFO: renamed from: c */
    public final int f29067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9644a(AbstractC10159f tracker, int i10) {
        super(tracker);
        this.f29066b = i10;
        switch (i10) {
            case 2:
                AbstractC16544l.m18094g(tracker, "tracker");
                super(tracker);
                this.f29067c = 7;
                break;
            case 3:
                AbstractC16544l.m18094g(tracker, "tracker");
                super(tracker);
                this.f29067c = 7;
                break;
            case 4:
                AbstractC16544l.m18094g(tracker, "tracker");
                super(tracker);
                this.f29067c = 9;
                break;
            default:
                AbstractC16544l.m18094g(tracker, "tracker");
                this.f29067c = 6;
                break;
        }
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: a */
    public final int mo10225a() {
        switch (this.f29066b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f29067c;
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: b */
    public final boolean mo10226b(C11245p c11245p) {
        switch (this.f29066b) {
            case 0:
                return c11245p.f34050j.f22393b;
            case 1:
                return c11245p.f34050j.f22395d;
            case 2:
                return c11245p.f34050j.f22392a == 2;
            case 3:
                int i10 = c11245p.f34050j.f22392a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                return c11245p.f34050j.f22396e;
        }
    }

    @Override // p590Y4.AbstractC9647d
    /* JADX INFO: renamed from: c */
    public final boolean mo10227c(Object obj) {
        switch (this.f29066b) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C9046d value = (C9046d) obj;
                AbstractC16544l.m18094g(value, "value");
                int i10 = Build.VERSION.SDK_INT;
                boolean z6 = value.f27617a;
                if (i10 >= 26) {
                    if (!z6 || !value.f27618b) {
                        return true;
                    }
                } else if (!z6) {
                    return true;
                }
                return false;
            case 3:
                C9046d value2 = (C9046d) obj;
                AbstractC16544l.m18094g(value2, "value");
                return !value2.f27617a || value2.f27619c;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9644a(C10154a tracker) {
        super(tracker);
        this.f29066b = 1;
        AbstractC16544l.m18094g(tracker, "tracker");
        this.f29067c = 5;
    }
}
