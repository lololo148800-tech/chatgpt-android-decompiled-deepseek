package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p1143z4.C21795y;
import p229J0.C4171z3;
import p318Mh.AbstractC5364G0;
import p318Mh.C5360E0;
import p553Wh.C8870f;
import p853kd.C16367b;
import p853kd.C16368c;
import p893n.AbstractActivityC17375g;
import re.C18953f;
import re.C18954g;
import re.InterfaceC18955h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lre/h;", "effect", "Lmm/C;", "invoke", "(Lre/h;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationScreenKt$ConversationScreen$voiceEndedViewModel$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16368c f37581Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractActivityC17375g f37582Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f37583o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationScreenKt$ConversationScreen$voiceEndedViewModel$1$1(C16368c c16368c, AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f) {
        super(1);
        this.f37581Y = c16368c;
        this.f37582Z = abstractActivityC17375g;
        this.f37583o0 = c8870f;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC18955h effect = (InterfaceC18955h) obj;
        AbstractC16544l.m18094g(effect, "effect");
        if (effect instanceof C18953f) {
            C16368c c16368c = this.f37581Y;
            if (c16368c != null) {
                AbstractActivityC17375g activity = this.f37582Z;
                AbstractC16544l.m18094g(activity, "activity");
                if (c16368c.f50843d) {
                    AbstractC0575H.m1156D(c16368c.f50840a, null, null, new C16367b(activity, c16368c, null), 3);
                }
            }
        } else if (effect instanceof C18954g) {
            C21795y c21795y = this.f37583o0.f27149b;
            C5360E0 c5360e0 = C5360E0.f17592g;
            c5360e0.getClass();
            AbstractC5364G0.m5889d(c21795y, c5360e0.m5885a(new C4171z3(((C18954g) effect).f60509a, 16)), true);
        }
        return C17296C.f55119a;
    }
}
