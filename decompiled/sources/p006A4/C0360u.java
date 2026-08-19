package p006A4;

import android.content.Context;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p334Na.AbstractC5695b;
import p523V9.AbstractC8040Z5;

/* JADX INFO: renamed from: A4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0360u extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1236Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f1237Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0360u(Context context, int i10) {
        super(0);
        this.f1236Y = i10;
        this.f1237Z = context;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f1236Y) {
            case 0:
                return AbstractC5695b.m6134a(this.f1237Z);
            case 1:
                Context context = this.f1237Z;
                Integer numM8409e = AbstractC8040Z5.m8409e(context, R.attr.personaSelfieLookLeftDrawable);
                return numM8409e != null ? context.getDrawable(numM8409e.intValue()) : context.getDrawable(R.drawable.pi2_ic_selfie_left);
            default:
                Context context2 = this.f1237Z;
                Integer numM8409e2 = AbstractC8040Z5.m8409e(context2, R.attr.personaSelfieLookRightDrawable);
                return numM8409e2 != null ? context2.getDrawable(numM8409e2.intValue()) : context2.getDrawable(R.drawable.pi2_ic_selfie_right);
        }
    }
}
