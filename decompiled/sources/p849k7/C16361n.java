package p849k7;

import android.content.Context;
import bb.AbstractC11330w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p087D7.AbstractC1977d;
import p1113xn.C21307a;
import p1145z7.InterfaceC21804a;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p676c7.C11682a;
import p676c7.C11685d;
import p676c7.EnumC11684c;
import p887m7.C17194t;
import p887m7.InterfaceC17178d;
import p909nm.AbstractC17678l;
import p975qp.InterfaceC18797a;
import p983r7.InterfaceC18886d;

/* JADX INFO: renamed from: k7.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16361n implements InterfaceC17178d, InterfaceC18797a, InterfaceC18886d, InterfaceC21804a {
    @Override // p887m7.InterfaceC17178d
    /* JADX INFO: renamed from: b */
    public AbstractC11330w mo10840b(C11682a context, List batch, byte[] bArr) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(batch, "batch");
        return C17194t.f54890d;
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: c */
    public String mo6199c() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: d */
    public String mo6200d() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: e */
    public String mo6201e() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: f */
    public String mo6202f() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: g */
    public String mo6203g() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: h */
    public String mo6204h() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: j */
    public String mo6205j() {
        return "";
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: k */
    public void mo17962k(Context context) {
        AbstractC16544l.m18094g(context, "context");
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: l */
    public String mo6206l() {
        return "";
    }

    @Override // p1145z7.InterfaceC21804a
    /* JADX INFO: renamed from: m */
    public EnumC11684c mo6207m() {
        return EnumC11684c.f35434Y;
    }

    @Override // p975qp.InterfaceC18797a
    /* JADX INFO: renamed from: n */
    public Map mo16558n() {
        return null;
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: o */
    public C11685d mo17963o() {
        return new C11685d(0, null, null, null, null, null, null, 127);
    }

    /* JADX INFO: renamed from: p */
    public String m17964p(String input) {
        AbstractC16544l.m18094g(input, "input");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = input.getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] hashBytes = messageDigest.digest();
            AbstractC16544l.m18093f(hashBytes, "hashBytes");
            return AbstractC17678l.m19282E(hashBytes, "", C16353f.f50789o0, 30);
        } catch (NoSuchAlgorithmException e10) {
            AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 5, EnumC11255b.f34098Y, C16350c.f50743z0, e10, false, 48);
            return null;
        }
    }

    @Override // p975qp.InterfaceC18797a
    public void clear() {
    }

    @Override // p983r7.InterfaceC18886d
    /* JADX INFO: renamed from: a */
    public void mo17961a(Context context) {
    }

    @Override // p975qp.InterfaceC18797a
    /* JADX INFO: renamed from: i */
    public void mo16557i(Map map) {
    }
}
