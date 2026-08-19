package p323Mm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C5515v extends AbstractC5516w {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f17967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5515v(int i10, Method method) {
        super(method, false, 6);
        this.f17967f = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(method, "method");
                super(method, true, 4);
                break;
            case 2:
                AbstractC16544l.m18094g(method, "method");
                super(method, false, 6);
                break;
            default:
                AbstractC16544l.m18094g(method, "method");
                break;
        }
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        switch (this.f17967f) {
            case 0:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                return m5921f(args[0], args.length <= 1 ? new Object[0] : AbstractC17678l.m19310q(args, 1, args.length));
            case 1:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                m5922e(AbstractC17678l.m19317x(args));
                return m5921f(null, args.length <= 1 ? new Object[0] : AbstractC17678l.m19310q(args, 1, args.length));
            default:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                return m5921f(null, args);
        }
    }
}
