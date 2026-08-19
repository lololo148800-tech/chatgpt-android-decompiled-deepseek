package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC16548p;
import p101Dl.InterfaceC2110k;
import p101Dl.InterfaceC2111l;
import p346Nn.C5866F;
import p346Nn.C5868H;
import p346Nn.C5869I;
import p349O0.InterfaceC5985X;
import p387Pl.AbstractC6470Q;
import p387Pl.C6501u;
import p557Wl.C8949e;

/* JADX INFO: renamed from: A1.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0298w extends AbstractC16548p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1072Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0298w(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f1072Y = i11;
    }

    @Override // p225Im.InterfaceC3771s
    public final Object get() {
        switch (this.f1072Y) {
            case 0:
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            case 1:
                return ((C6501u) this.receiver).m7065l();
            case 2:
                return ((C6501u) this.receiver).m7065l();
            case 3:
                return ((InterfaceC5985X) this.receiver).getValue();
            case 4:
                return ((C6501u) this.receiver).m7065l();
            case 5:
                return ((AbstractC6470Q) this.receiver).m7055c();
            case 6:
                return ((C5866F) this.receiver).f19175c;
            case 7:
                return ((C5868H) this.receiver).f19179a;
            case 8:
                return ((C5868H) this.receiver).f19180b;
            case 9:
                return ((C5868H) this.receiver).f19182d;
            case 10:
                return ((C5866F) this.receiver).f19174b;
            case 11:
                return ((C5869I) this.receiver).f19186b;
            case 12:
                return ((C5869I) this.receiver).f19187c;
            case 13:
                return ((C5869I) this.receiver).f19188d;
            case 14:
                return ((C5868H) this.receiver).f19183e;
            case 15:
                C8949e c8949e = (C8949e) ((InterfaceC2110k) this.receiver);
                c8949e.getClass();
                return (InterfaceC2111l) c8949e.f27359b.m8943c(C8949e.f27357f[0]);
            default:
                C8949e c8949e2 = (C8949e) ((InterfaceC2110k) this.receiver);
                c8949e2.getClass();
                Boolean bool = (Boolean) c8949e2.f27361d.m8943c(C8949e.f27357f[2]);
                bool.getClass();
                return bool;
        }
    }
}
