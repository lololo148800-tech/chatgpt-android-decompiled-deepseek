package p003A1;

import android.widget.Button;
import com.withpersona.sdk2.inquiry.network.dto.styling.BaseButtonComponentStyle;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1025te.C19866Q;
import p1028u.C20089f;
import p1071w0.C20750g0;
import p1110xk.AbstractC21282e;
import p1113xn.AbstractC21322p;
import p1150zd.EnumC21867c;
import p1150zd.EnumC21876l;
import p183H4.C3231f;
import p316Mf.C5345l;
import p349O0.InterfaceC5985X;
import p387Pl.AbstractC6468O;
import p479Td.C7351f0;
import p550We.C8829j;
import p622Ze.C10294l;
import p737f1.C13522n;

/* JADX INFO: renamed from: A1.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0201R0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f746Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f747Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f748o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f749p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201R0(BaseButtonComponentStyle baseButtonComponentStyle, Button button, boolean z6, boolean z10) {
        super(0);
        this.f746Y = 8;
        this.f748o0 = baseButtonComponentStyle;
        this.f749p0 = button;
        this.f747Z = z10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        String str;
        InterfaceC0300w1 interfaceC0300w1;
        EnumC21876l enumC21876l;
        switch (this.f746Y) {
            case 0:
                if (this.f747Z) {
                    ((C20089f) ((C3231f) this.f748o0).f9800d).mo20918j((String) this.f749p0);
                }
                return C17296C.f55119a;
            case 1:
                AbstractC6468O abstractC6468O = (AbstractC6468O) this.f748o0;
                if (abstractC6468O.m7052d()) {
                    return C17296C.f55119a;
                }
                abstractC6468O.mo7051c();
                return Boolean.valueOf(((AbstractC6468O) this.f749p0).mo7051c().setEnabled(this.f747Z));
            case 2:
                if (this.f747Z) {
                    ((InterfaceC1436k) this.f748o0).invoke(new C10294l(((C8829j) this.f749p0).f27015a));
                }
                return C17296C.f55119a;
            case 3:
                if (this.f747Z) {
                    ((InterfaceC1426a) this.f748o0).invoke();
                } else {
                    ((InterfaceC1426a) this.f749p0).invoke();
                }
                return C17296C.f55119a;
            case 4:
                if (!((C19866Q) this.f748o0).m20785h()) {
                    ((InterfaceC5985X) this.f749p0).setValue(Boolean.valueOf(this.f747Z));
                }
                return C17296C.f55119a;
            case 5:
                return Boolean.valueOf(((((Set) ((InterfaceC5985X) this.f748o0).getValue()).isEmpty() && ((str = (String) ((InterfaceC5985X) this.f749p0).getValue()) == null || AbstractC21322p.m21681O(str))) || this.f747Z) ? false : true);
            case 6:
                C20750g0 c20750g0 = (C20750g0) this.f748o0;
                if (!c20750g0.m21292b()) {
                    ((C13522n) this.f749p0).m15073b();
                } else if (!this.f747Z && (interfaceC0300w1 = c20750g0.f65812c) != null) {
                    ((C0190N0) interfaceC0300w1).m572b();
                }
                return Boolean.TRUE;
            case 7:
                EnumC21867c enumC21867c = EnumC21867c.f69340Z;
                boolean z6 = this.f747Z;
                if (z6) {
                    enumC21876l = EnumC21876l.f69363Z;
                } else {
                    if (z6) {
                        throw new C0644w();
                    }
                    enumC21876l = EnumC21876l.f69362Y;
                }
                ((InterfaceC1436k) this.f748o0).invoke(new C5345l((C7351f0) this.f749p0, enumC21867c, enumC21876l));
                return C17296C.f55119a;
            default:
                AbstractC21282e.m21623b((BaseButtonComponentStyle) this.f748o0, (Button) this.f749p0, this.f747Z);
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0201R0(Object obj, Object obj2, boolean z6, int i10) {
        super(0);
        this.f746Y = i10;
        this.f748o0 = obj;
        this.f749p0 = obj2;
        this.f747Z = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201R0(C19866Q c19866q, boolean z6, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f746Y = 4;
        this.f748o0 = c19866q;
        this.f747Z = z6;
        this.f749p0 = interfaceC5985X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0201R0(boolean z6, Object obj, Object obj2, int i10) {
        super(0);
        this.f746Y = i10;
        this.f747Z = z6;
        this.f748o0 = obj;
        this.f749p0 = obj2;
    }
}
