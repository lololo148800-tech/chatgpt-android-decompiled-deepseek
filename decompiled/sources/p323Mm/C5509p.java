package p323Mm;

import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Mm.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C5509p extends AbstractC5510q {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f17961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5509p(Field field, boolean z6, boolean z10, int i10) {
        super(field, z6, z10);
        this.f17961f = i10;
    }

    @Override // p323Mm.AbstractC5510q, p323Mm.AbstractC5517x
    /* JADX INFO: renamed from: d */
    public void mo5920d(Object[] args) {
        switch (this.f17961f) {
            case 1:
                AbstractC16544l.m18094g(args, "args");
                super.mo5920d(args);
                m5922e(AbstractC17678l.m19317x(args));
                break;
            default:
                super.mo5920d(args);
                break;
        }
    }
}
