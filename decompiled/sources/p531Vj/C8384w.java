package p531Vj;

import android.content.Intent;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p729ej.C13430u;

/* JADX INFO: renamed from: Vj.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C8384w extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26089Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8387z f26090Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8383v f26091o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8384w(C8387z c8387z, C8383v c8383v, int i10) {
        super(1);
        this.f26089Y = i10;
        this.f26090Z = c8387z;
        this.f26091o0 = c8383v;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26089Y) {
            case 0:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                C8387z.m8942e(this.f26090Z, action, new C8331A(this.f26091o0.f26083a, EnumC8333C.f25979Y));
                return C17296C.f55119a;
            case 1:
                C13430u action2 = (C13430u) obj;
                AbstractC16544l.m18094g(action2, "$this$action");
                C8387z.m8942e(this.f26090Z, action2, new C8331A(this.f26091o0.f26083a, EnumC8333C.f25980Z));
                return C17296C.f55119a;
            case 2:
                C13430u action3 = (C13430u) obj;
                AbstractC16544l.m18094g(action3, "$this$action");
                C8387z.m8942e(this.f26090Z, action3, new C8331A(this.f26091o0.f26083a, EnumC8333C.f25979Y));
                return C17296C.f55119a;
            case 3:
                C13430u action4 = (C13430u) obj;
                AbstractC16544l.m18094g(action4, "$this$action");
                C8387z.m8942e(this.f26090Z, action4, new C8331A(this.f26091o0.f26083a, EnumC8333C.f25980Z));
                return C17296C.f55119a;
            case 4:
                C13430u action5 = (C13430u) obj;
                AbstractC16544l.m18094g(action5, "$this$action");
                C8387z.m8942e(this.f26090Z, action5, new C8331A(this.f26091o0.f26083a, EnumC8333C.f25981o0));
                return C17296C.f55119a;
            default:
                AbstractC8373l it = (AbstractC8373l) obj;
                AbstractC16544l.m18094g(it, "it");
                boolean z6 = it instanceof C8372k;
                C8383v c8383v = this.f26091o0;
                C8387z c8387z = this.f26090Z;
                if (z6) {
                    return AbstractC8215v5.m8839a(c8387z, new C8384w(c8387z, c8383v, 2));
                }
                if (it instanceof C8370i) {
                    return AbstractC8215v5.m8839a(c8387z, new C8384w(c8387z, c8383v, 3));
                }
                if (!(it instanceof C8371j)) {
                    throw new C0644w();
                }
                c8387z.getClass();
                Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                intent.setFlags(268435456);
                c8387z.f26104a.startActivity(intent);
                return AbstractC8215v5.m8839a(c8387z, new C8384w(c8387z, c8383v, 4));
        }
    }
}
