package p1142z3;

import java.util.Map;
import p644ab.InterfaceC10533f;

/* JADX INFO: renamed from: z3.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21745m implements InterfaceC10533f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68994Y;

    @Override // p644ab.InterfaceC10533f
    public final boolean apply(Object obj) {
        switch (this.f68994Y) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
