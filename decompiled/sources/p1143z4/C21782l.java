package p1143z4;

import androidx.navigation.AbstractC11122c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p011A9.p012Ra.ahZQMZ;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: z4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C21782l extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f69097Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11122c f69098Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21782l(AbstractC11122c abstractC11122c, int i10) {
        super(1);
        this.f69097Y = i10;
        this.f69098Z = abstractC11122c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f69097Y) {
            case 0:
                AbstractC21790t abstractC21790t = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(abstractC21790t, ahZQMZ.gocHhWEUmiwt);
                return Boolean.valueOf(!this.f69098Z.f33542n.containsKey(Integer.valueOf(abstractC21790t.f69135r0)));
            default:
                AbstractC21790t destination = (AbstractC21790t) obj;
                AbstractC16544l.m18094g(destination, "destination");
                return Boolean.valueOf(!this.f69098Z.f33542n.containsKey(Integer.valueOf(destination.f69135r0)));
        }
    }
}
