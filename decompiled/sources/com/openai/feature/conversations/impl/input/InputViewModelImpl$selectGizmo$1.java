package com.openai.feature.conversations.impl.input;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p1025te.C19851B;
import p1025te.C19863N;
import p1025te.C19866Q;
import p1042uh.C20263a0;
import p1081wc.C20893l;
import p1081wc.InterfaceC20904w;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p204I1.C3581L;
import p350O1.C6045C;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$selectGizmo$1", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$selectGizmo$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputViewModelImpl f37959Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19851B f37960Z;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$selectGizmo$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/Q;", "invoke", "(Lte/Q;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123341 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C19851B f37961Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123341(C19851B c19851b) {
            super(1);
            this.f37961Y = c19851b;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19866Q setState = (C19866Q) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C19866Q.m20782e(setState, null, null, null, null, false, null, null, null, false, this.f37961Y.f62942a, null, null, false, false, null, false, null, false, false, false, 8387583);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$selectGizmo$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123352 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C19851B f37962Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123352(C19851B c19851b) {
            super(1);
            this.f37962Y = c19851b;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            CharSequence charSequenceSubSequence;
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            C19851B c19851b = this.f37962Y;
            C20263a0 c20263a0 = c19851b.f62942a;
            C6045C c6045c = update.f62954a;
            AbstractC16544l.m18094g(c6045c, "<this>");
            String str = c6045c.f19682a.f10934Y;
            long j10 = c6045c.f19683b;
            int iM4270f = C3581L.m4270f(j10);
            if (iM4270f != 0 && str.length() != 0) {
                if (c20263a0 == null) {
                    boolean zM21698f0 = AbstractC21322p.m21698f0(str, (char) 8203);
                    if (zM21698f0) {
                        c6045c = new C6045C(AbstractC8676n.m9365b(((int) (j10 >> 32)) - 1, ((int) (j10 & 4294967295L)) - 1), AbstractC21322p.m21715w0(str, 8203), 4);
                    } else if (zM21698f0) {
                        throw new C0644w();
                    }
                } else {
                    String strSubstring = str.substring(0, iM4270f);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    int iM21683Q = AbstractC21322p.m21683Q(strSubstring, ' ', 0, 6);
                    Integer numValueOf = Integer.valueOf(iM21683Q);
                    if (iM21683Q == -1) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() + 1 : 0;
                    int iM21678L = AbstractC21322p.m21678L(str, ' ', iM4270f, false, 4);
                    Integer numValueOf2 = iM21678L != -1 ? Integer.valueOf(iM21678L) : null;
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : str.length();
                    String strSubstring2 = strSubstring.substring(iIntValue);
                    AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                    if (AbstractC21329w.m21734u(strSubstring2, Separators.f31989AT, false)) {
                        if (iIntValue2 < iIntValue) {
                            throw new IndexOutOfBoundsException(AbstractC0168G.m532u("End index (", iIntValue2, ") is less than start index (", iIntValue, ")."));
                        }
                        if (iIntValue2 == iIntValue) {
                            charSequenceSubSequence = str.subSequence(0, str.length());
                        } else {
                            StringBuilder sb2 = new StringBuilder(str.length() - (iIntValue2 - iIntValue));
                            sb2.append((CharSequence) str, 0, iIntValue);
                            sb2.append((CharSequence) str, iIntValue2, str.length());
                            charSequenceSubSequence = sb2;
                        }
                        int i10 = iIntValue + 1;
                        c6045c = new C6045C(AbstractC8676n.m9365b(i10, i10), AbstractC9306j0.m9889h("\u200b", charSequenceSubSequence.toString()), 4);
                    }
                }
            }
            return C19863N.m20780a(update, c6045c, false, null, c19851b.f62942a, false, null, null, null, 246);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$selectGizmo$1(InputViewModelImpl inputViewModelImpl, C19851B c19851b, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37959Y = inputViewModelImpl;
        this.f37960Z = c19851b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new InputViewModelImpl$selectGizmo$1(this.f37959Y, this.f37960Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InputViewModelImpl$selectGizmo$1 inputViewModelImpl$selectGizmo$1 = (InputViewModelImpl$selectGizmo$1) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        inputViewModelImpl$selectGizmo$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InputViewModelImpl inputViewModelImpl = this.f37959Y;
        InterfaceC20904w interfaceC20904w = inputViewModelImpl.f37890r;
        C20893l c20893l = C20893l.f66568f;
        C19851B c19851b = this.f37960Z;
        C20263a0 c20263a0 = c19851b.f62942a;
        String str = c20263a0 != null ? c20263a0.f64085b : null;
        if (str == null) {
            str = "";
        }
        interfaceC20904w.mo21448b(c20893l, str, C17690x.f56481Y);
        inputViewModelImpl.m14397m(new C123341(c19851b));
        inputViewModelImpl.f37883k.m20781a(new C123352(c19851b));
        if (c19851b.f62942a != null && ((C19866Q) inputViewModelImpl.m14391f()).f62977h == EnumC21517f.f68139o0) {
            inputViewModelImpl.f37889q.m19711b(EnumC21517f.f68138Z);
        }
        return C17296C.f55119a;
    }
}
