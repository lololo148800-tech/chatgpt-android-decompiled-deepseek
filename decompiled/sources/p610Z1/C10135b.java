package p610Z1;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Z1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10135b extends Throwable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30043Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10135b(String str, int i10) {
        super(str);
        this.f30043Y = i10;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized Throwable m10726a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized Throwable m10727b() {
        return this;
    }

    /* JADX INFO: renamed from: c */
    private final synchronized Throwable m10728c() {
        return this;
    }

    /* JADX INFO: renamed from: d */
    private final synchronized Throwable m10729d() {
        return this;
    }

    /* JADX INFO: renamed from: e */
    private final synchronized Throwable m10730e() {
        return this;
    }

    /* JADX INFO: renamed from: f */
    private final synchronized Throwable m10731f() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f30043Y) {
            case 0:
                m10726a();
                return this;
            case 1:
                m10727b();
                return this;
            case 2:
                m10728c();
                return this;
            case 3:
                m10729d();
                return this;
            case 4:
                m10730e();
                return this;
            case 5:
                m10731f();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10135b(String message) {
        super(message);
        this.f30043Y = 6;
        AbstractC16544l.m18094g(message, "message");
    }
}
