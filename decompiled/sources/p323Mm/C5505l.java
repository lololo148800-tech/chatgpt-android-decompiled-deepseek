package p323Mm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8501J3;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5505l extends AbstractC5506m {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f17959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5505l(Field field, boolean z6, int i10) {
        super(field, z6);
        this.f17959e = i10;
    }

    @Override // p323Mm.AbstractC5517x
    /* JADX INFO: renamed from: d */
    public void mo5920d(Object[] args) {
        switch (this.f17959e) {
            case 1:
                AbstractC16544l.m18094g(args, "args");
                AbstractC8501J3.m9165a(this, args);
                m5922e(AbstractC17678l.m19317x(args));
                break;
            default:
                super.mo5920d(args);
                break;
        }
    }
}
