package p544W9;

import com.openai.chatgpt.R;
import p020Ai.C0515d;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p219Ig.InterfaceC3717f;
import p219Ig.InterfaceC3718g;

/* JADX INFO: renamed from: W9.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8730w {
    /* JADX INFO: renamed from: a */
    public static int m9461a(int i10, int i11) {
        return (i10 & 16777215) | (i11 << 24);
    }

    /* JADX INFO: renamed from: b */
    public static String m9462b(InterfaceC3718g interfaceC3718g) {
        C0515d c0515dMo4415a;
        C21891A c21891aM1126b;
        String str;
        InterfaceC3717f interfaceC3717f = interfaceC3718g instanceof InterfaceC3717f ? (InterfaceC3717f) interfaceC3718g : null;
        if (interfaceC3717f == null || (c0515dMo4415a = interfaceC3717f.mo4415a()) == null || (c21891aM1126b = c0515dMo4415a.m1126b()) == null) {
            return null;
        }
        C22038o c22038o = c21891aM1126b.f69415a;
        return (c22038o == null || (str = c22038o.f69715e) == null) ? c21891aM1126b.f69416b.f69658d : str;
    }

    /* JADX INFO: renamed from: c */
    public static int m9463c(InterfaceC3718g interfaceC3718g) {
        return ((interfaceC3718g instanceof InterfaceC3717f) && ((InterfaceC3717f) interfaceC3718g).mo4416b()) ? R.string.deactivated_account_continue_free_button : R.string.deactivated_account_continue_button;
    }
}
