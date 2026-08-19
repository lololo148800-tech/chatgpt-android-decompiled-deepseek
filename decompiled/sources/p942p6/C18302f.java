package p942p6;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0676j;
import p033B5.C0819c;
import p1006s6.C19451a;
import p523V9.AbstractC7849B0;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: p6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C18302f implements InterfaceC18298b {

    /* JADX INFO: renamed from: Y */
    public final LinkedHashMap f58419Y;

    /* JADX INFO: renamed from: Z */
    public final C0678l f58420Z;

    /* JADX INFO: renamed from: o0 */
    public final String f58421o0;

    /* JADX INFO: renamed from: p0 */
    public final String f58422p0;

    /* JADX INFO: renamed from: q0 */
    public final C17314q f58423q0;

    public C18302f(LinkedHashMap uploads, C0678l operationByteString) {
        AbstractC16544l.m18094g(uploads, "uploads");
        AbstractC16544l.m18094g(operationByteString, "operationByteString");
        this.f58419Y = uploads;
        this.f58420Z = operationByteString;
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC16544l.m18093f(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        this.f58421o0 = string;
        this.f58422p0 = "multipart/form-data; boundary=".concat(string);
        this.f58423q0 = AbstractC9227W.m9800c(new C0819c(this, 20));
    }

    /* JADX INFO: renamed from: a */
    public final void m19840a(InterfaceC0676j interfaceC0676j) throws EOFException {
        StringBuilder sb2 = new StringBuilder("--");
        String str = this.f58421o0;
        sb2.append(str);
        sb2.append(Separators.NEWLINE);
        interfaceC0676j.mo1333c0(sb2.toString());
        interfaceC0676j.mo1333c0("Content-Disposition: form-data; name=\"operations\"\r\n");
        interfaceC0676j.mo1333c0("Content-Type: application/json\r\n");
        StringBuilder sb3 = new StringBuilder("Content-Length: ");
        C0678l c0678l = this.f58420Z;
        sb3.append(c0678l.mo1372d());
        sb3.append(Separators.NEWLINE);
        interfaceC0676j.mo1333c0(sb3.toString());
        interfaceC0676j.mo1333c0(Separators.NEWLINE);
        interfaceC0676j.mo1332b0(c0678l);
        C0675i c0675i = new C0675i();
        C19451a c19451a = new C19451a(c0675i, null);
        LinkedHashMap linkedHashMap = this.f58419Y;
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(setEntrySet, 10));
        int i10 = 0;
        for (Object obj : setEntrySet) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            arrayList.add(new C17309l(String.valueOf(i10), AbstractC9393x3.m9974d(((Map.Entry) obj).getKey())));
            i10 = i11;
        }
        AbstractC7849B0.m8108c(c19451a, AbstractC17659D.m19253o(arrayList));
        C0678l c0678lM1417C0 = c0675i.m1417C0(c0675i.f1970Z);
        interfaceC0676j.mo1333c0("\r\n--" + str + Separators.NEWLINE);
        interfaceC0676j.mo1333c0("Content-Disposition: form-data; name=\"map\"\r\n");
        interfaceC0676j.mo1333c0("Content-Type: application/json\r\n");
        interfaceC0676j.mo1333c0("Content-Length: " + c0678lM1417C0.mo1372d() + Separators.NEWLINE);
        interfaceC0676j.mo1333c0(Separators.NEWLINE);
        interfaceC0676j.mo1332b0(c0678lM1417C0);
        Iterator it = linkedHashMap.values().iterator();
        if (!it.hasNext()) {
            interfaceC0676j.mo1333c0("\r\n--" + str + "--\r\n");
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        interfaceC0676j.mo1333c0("\r\n--" + str + Separators.NEWLINE);
        interfaceC0676j.mo1333c0("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // p942p6.InterfaceC18298b
    /* JADX INFO: renamed from: g */
    public final void mo3050g(InterfaceC0676j interfaceC0676j) throws EOFException {
        m19840a(interfaceC0676j);
    }

    @Override // p942p6.InterfaceC18298b
    public final long getContentLength() {
        return ((Number) this.f58423q0.getValue()).longValue();
    }

    @Override // p942p6.InterfaceC18298b
    public final String getContentType() {
        return this.f58422p0;
    }
}
