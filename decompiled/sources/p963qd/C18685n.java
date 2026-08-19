package p963qd;

import bf.C11377e;
import com.openai.feature.conversationhistory.impl.archive.ArchiveViewModel;
import com.openai.feature.sanction.impl.SanctionViewModel;
import com.openai.viewmodel.BaseViewModel;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1803f0;
import p080D0.C1837w0;
import p1071w0.AbstractC20740b0;
import p1071w0.AbstractC20743d;
import p1071w0.C20757k;
import p204I1.C3590f;
import p253K.AbstractC4502m;
import p349O0.C5997d;
import p349O0.C6021p;
import p479Td.C7320F;
import p523V9.AbstractC7902H5;
import p523V9.AbstractC7918J5;
import p523V9.AbstractC7957O4;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8231x5;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;
import sg.C19575q;

/* JADX INFO: renamed from: qd.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C18685n extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59483Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f59484Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f59485o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f59486p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18685n(InterfaceC10459q interfaceC10459q, BaseViewModel baseViewModel, int i10, int i11) {
        super(2);
        this.f59483Y = i11;
        this.f59486p0 = interfaceC10459q;
        this.f59485o0 = baseViewModel;
        this.f59484Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f59483Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f59484Z | 1);
                AbstractC4502m.m5240c((C11377e) this.f59485o0, (InterfaceC10459q) this.f59486p0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f59484Z | 1);
                AbstractC8086f4.m8520g((InterfaceC1436k) this.f59485o0, (C19575q) this.f59486p0, c6021p, iM6447d1);
                break;
            case 2:
                AbstractC7957O4.m8241a((InterfaceC10459q) this.f59486p0, (ArchiveViewModel) this.f59485o0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            case 3:
                AbstractC20743d.m21287a((C3590f) this.f59485o0, (List) this.f59486p0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            case 4:
                int iM6447d2 = C5997d.m6447d0(this.f59484Z | 1);
                ((C20757k) this.f59485o0).mo5856k((C8410b) this.f59486p0, c6021p, iM6447d2);
                break;
            case 5:
                AbstractC20740b0.m21264e((C1837w0) this.f59485o0, (C8410b) this.f59486p0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            case 6:
                AbstractC20740b0.m21263d((C1803f0) this.f59485o0, (C8410b) this.f59486p0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            case 7:
                AbstractC8231x5.m8865a((InterfaceC10459q) this.f59486p0, (SanctionViewModel) this.f59485o0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            case 8:
                AbstractC7902H5.m8201f((C7320F) this.f59485o0, (InterfaceC1426a) this.f59486p0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
            default:
                AbstractC7918J5.m8211a((C3590f) this.f59485o0, (InterfaceC10459q) this.f59486p0, c6021p, C5997d.m6447d0(this.f59484Z | 1));
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18685n(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f59483Y = i11;
        this.f59485o0 = obj;
        this.f59486p0 = obj2;
        this.f59484Z = i10;
    }
}
