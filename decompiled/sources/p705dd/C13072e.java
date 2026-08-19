package p705dd;

import android.graphics.Shader;
import java.util.List;
import p349O0.InterfaceC5982V0;
import p523V9.AbstractC8088f6;
import p759g1.C13803e;
import p774h1.AbstractC14334L;
import p774h1.AbstractC14337O;

/* JADX INFO: renamed from: dd.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13072e extends AbstractC14337O {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f41530c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC5982V0 f41531d;

    public C13072e(List list, InterfaceC5982V0 interfaceC5982V0) {
        this.f41530c = list;
        this.f41531d = interfaceC5982V0;
    }

    @Override // p774h1.AbstractC14337O
    /* JADX INFO: renamed from: b */
    public final Shader mo14804b(long j10) {
        float fFloatValue = ((Number) this.f41531d.getValue()).floatValue() * C13803e.m15333e(j10);
        return AbstractC14334L.m15629g(AbstractC8088f6.m8536b(fFloatValue, 0.0f), AbstractC8088f6.m8536b(C13803e.m15333e(j10) + fFloatValue, 0.0f), this.f41530c, null, 2);
    }
}
