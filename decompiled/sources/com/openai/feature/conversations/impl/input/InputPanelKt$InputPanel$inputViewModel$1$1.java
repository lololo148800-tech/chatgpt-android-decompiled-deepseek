package com.openai.feature.conversations.impl.input;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p049Bm.InterfaceC1436k;
import p1025te.C19884o;
import p1025te.C19885p;
import p1025te.C19886q;
import p1025te.C19887r;
import p1025te.InterfaceC19888s;
import p349O0.InterfaceC5985X;
import p507Uh.C7680f;
import p507Uh.C7681g;
import p507Uh.InterfaceC7678d;
import p507Uh.InterfaceC7682h;
import p544W9.AbstractC8566U3;
import p553Wh.C8870f;
import p571X9.AbstractC9209T;
import p594Y9.AbstractC9842Z;
import p795i.C14893g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/s;", "effect", "Lmm/C;", "invoke", "(Lte/s;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputPanelKt$InputPanel$inputViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC7678d f37873Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14893g f37874Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f37875o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C14893g f37876p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C14893g f37877q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC0300w1 f37878r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f37879s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputPanelKt$InputPanel$inputViewModel$1$1(InterfaceC7678d interfaceC7678d, C14893g c14893g, C8870f c8870f, C14893g c14893g2, C14893g c14893g3, InterfaceC0300w1 interfaceC0300w1, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f37873Y = interfaceC7678d;
        this.f37874Z = c14893g;
        this.f37875o0 = c8870f;
        this.f37876p0 = c14893g2;
        this.f37877q0 = c14893g3;
        this.f37878r0 = interfaceC0300w1;
        this.f37879s0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC0300w1 interfaceC0300w1;
        InterfaceC19888s effect = (InterfaceC19888s) obj;
        AbstractC16544l.m18094g(effect, "effect");
        boolean z6 = effect instanceof C19887r;
        C8870f c8870f = this.f37875o0;
        if (z6) {
            InterfaceC7678d interfaceC7678d = this.f37873Y;
            InterfaceC7682h interfaceC7682hMo3586a = interfaceC7678d.mo3586a();
            if (interfaceC7682hMo3586a instanceof C7680f) {
                boolean zM10490b = AbstractC9842Z.m10490b(interfaceC7678d.mo3586a());
                if (zM10490b) {
                    this.f37879s0.setValue(Boolean.TRUE);
                } else if (!zM10490b) {
                    interfaceC7678d.mo3587b();
                }
            } else if (AbstractC16544l.m18089b(interfaceC7682hMo3586a, C7681g.f24220a)) {
                AbstractC9209T.m9775a(this.f37874Z, ((C19887r) effect).f63033a, c8870f, R.string.conversations_take_photo_activity_not_found);
            }
        } else if (effect instanceof C19886q) {
            AbstractC9209T.m9775a(this.f37876p0, AbstractC8566U3.m9231a(), c8870f, R.string.conversations_pick_image_activity_not_found);
        } else if (effect instanceof C19885p) {
            AbstractC9209T.m9775a(this.f37877q0, new String[]{"*/*"}, c8870f, R.string.conversations_pick_file_activity_not_found);
        } else if ((effect instanceof C19884o) && (interfaceC0300w1 = this.f37878r0) != null) {
            ((C0190N0) interfaceC0300w1).m571a();
        }
        return C17296C.f55119a;
    }
}
