package p349O0;

import java.util.concurrent.CancellationException;
import p1014t1.AbstractC19736m;
import p635a1.AbstractC10443a;

/* JADX INFO: renamed from: O0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C5972Q extends CancellationException {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19437Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5972Q(String str, int i10) {
        super(str);
        this.f19437Y = i10;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f19437Y) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 1:
                setStackTrace(AbstractC10443a.f30931e);
                return this;
            case 2:
            case 5:
            default:
                return super.fillInStackTrace();
            case 3:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 4:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 6:
                setStackTrace(AbstractC19736m.f62476c);
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5972Q() {
        super("The coroutine scope left the composition");
        this.f19437Y = 0;
    }
}
