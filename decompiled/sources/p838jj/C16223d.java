package p838jj;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p247Jj.C4406S;
import p769gj.C14183y;
import p826j6.C16137F;
import p893n.C17372d;
import p893n.DialogInterfaceC17373e;

/* JADX INFO: renamed from: jj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C16223d extends AbstractC16236q {

    /* JADX INFO: renamed from: t0 */
    public static final C4406S f50336t0 = new C4406S(2);

    /* JADX INFO: renamed from: s0 */
    public final int f50337s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16223d(Context context, int i10) {
        super(context, null, 0, 0);
        AbstractC16544l.m18094g(context, "context");
        this.f50337s0 = i10;
    }

    @Override // p838jj.AbstractC16236q
    /* JADX INFO: renamed from: b */
    public final C16231l mo17806b(Object obj, C14183y initialViewEnvironment) {
        C16229j initialModalRendering = (C16229j) obj;
        AbstractC16544l.m18094g(initialModalRendering, "initialModalRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        C16231l c16231l = new C16231l(initialModalRendering, initialViewEnvironment, new C16137F(getContext(), this.f50337s0).m17689d(), null);
        mo17807d(c16231l);
        return c16231l;
    }

    @Override // p838jj.AbstractC16236q
    /* JADX INFO: renamed from: d */
    public final void mo17807d(C16231l c16231l) {
        int i10;
        C17296C c17296c;
        byte b;
        Button button;
        DialogInterfaceC17373e dialogInterfaceC17373e = (DialogInterfaceC17373e) c16231l.f50351c;
        final C16229j c16229j = (C16229j) c16231l.f50349a;
        int i11 = 0;
        if (c16229j.f50347d) {
            dialogInterfaceC17373e.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: jj.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C16229j rendering = c16229j;
                    AbstractC16544l.m18094g(rendering, "$rendering");
                    rendering.f50348e.invoke(C16227h.f50343a);
                }
            });
            dialogInterfaceC17373e.setCancelable(true);
        } else {
            dialogInterfaceC17373e.setCancelable(false);
        }
        EnumC16225f[] enumC16225fArrValues = EnumC16225f.values();
        int length = enumC16225fArrValues.length;
        while (true) {
            C17372d c17372d = dialogInterfaceC17373e.f55481r0;
            if (i11 >= length) {
                String str = c16229j.f50345b;
                c17372d.f55457e = str;
                TextView textView = c17372d.f55472t;
                if (textView != null) {
                    textView.setText(str);
                }
                dialogInterfaceC17373e.setTitle(c16229j.f50346c);
                return;
            }
            final EnumC16225f enumC16225f = enumC16225fArrValues[i11];
            i11++;
            String str2 = (String) c16229j.f50344a.get(enumC16225f);
            if (str2 == null) {
                c17296c = null;
            } else {
                int iOrdinal = enumC16225f.ordinal();
                if (iOrdinal == 0) {
                    i10 = -1;
                } else if (iOrdinal == 1) {
                    i10 = -2;
                } else {
                    if (iOrdinal != 2) {
                        throw new C0644w();
                    }
                    i10 = -3;
                }
                Message messageObtainMessage = c17372d.f55451C.obtainMessage(i10, new DialogInterface.OnClickListener() { // from class: jj.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        C16229j rendering = c16229j;
                        AbstractC16544l.m18094g(rendering, "$rendering");
                        rendering.f50348e.invoke(new C16226g(enumC16225f));
                    }
                });
                if (i10 == -3) {
                    c17372d.f55466n = str2;
                    c17372d.f55467o = messageObtainMessage;
                } else if (i10 == -2) {
                    c17372d.f55463k = str2;
                    c17372d.f55464l = messageObtainMessage;
                } else {
                    if (i10 != -1) {
                        throw new IllegalArgumentException("Button does not exist");
                    }
                    c17372d.f55460h = str2;
                    c17372d.f55461i = messageObtainMessage;
                }
                c17296c = C17296C.f55119a;
            }
            if (c17296c == null) {
                int iOrdinal2 = enumC16225f.ordinal();
                if (iOrdinal2 == 0) {
                    b = -1;
                } else if (iOrdinal2 == 1) {
                    b = -2;
                } else {
                    if (iOrdinal2 != 2) {
                        throw new C0644w();
                    }
                    b = -3;
                }
                if (b == -3) {
                    button = c17372d.f55465m;
                } else if (b == -2) {
                    button = c17372d.f55462j;
                } else if (b != -1) {
                    c17372d.getClass();
                    button = null;
                } else {
                    button = c17372d.f55459g;
                }
                if (button != null) {
                    button.setVisibility(4);
                }
            }
        }
    }
}
