package p1143z4;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: z4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C21785o extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69103Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Bundle f69104Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21785o(int i10, Bundle bundle) {
        super(1);
        this.f69103Y = i10;
        this.f69104Z = bundle;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69103Y) {
            case 0:
                String argName = (String) obj;
                AbstractC16544l.m18094g(argName, "argName");
                return Boolean.valueOf(!this.f69104Z.containsKey(argName));
            default:
                String key = (String) obj;
                AbstractC16544l.m18094g(key, "key");
                return Boolean.valueOf(!this.f69104Z.containsKey(key));
        }
    }
}
