package p434Rk;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Rk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6909a extends IllegalStateException {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22155Y = 1;

    /* JADX INFO: renamed from: Z */
    public final Serializable f22156Z;

    public C6909a() {
        super("Client already closed");
        this.f22156Z = null;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f22155Y) {
            case 1:
                return (Throwable) this.f22156Z;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f22155Y) {
            case 0:
                return (String) this.f22156Z;
            default:
                return super.getMessage();
        }
    }

    public C6909a(C6911c call) {
        AbstractC16544l.m18094g(call, "call");
        this.f22156Z = "Response already received: " + call;
    }
}
