package p346Nn;

import kotlin.jvm.internal.AbstractC16544l;
import p016Ae.C0439a;
import p389Pn.C6520e;
import p437Rn.C6953k;
import p437Rn.C6960r;
import p437Rn.InterfaceC6945c;
import p571X9.AbstractC9315k3;

/* JADX INFO: renamed from: Nn.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5886a {
    /* JADX INFO: renamed from: a */
    public abstract C6520e mo6300a();

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC6945c mo6301b();

    /* JADX INFO: renamed from: c */
    public final Object m6312c(String input) {
        String str;
        AbstractC16544l.m18094g(input, "input");
        try {
            C6960r commands = mo6300a().f21130c;
            AbstractC16544l.m18094g(commands, "commands");
            try {
                return mo6302d(AbstractC9315k3.m9908a(commands, input, mo6301b()));
            } catch (IllegalArgumentException e10) {
                String message = e10.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) input) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) input) + "')";
                }
                throw new C0439a(str, e10);
            }
        } catch (C6953k e11) {
            throw new C0439a("Failed to parse value from '" + ((Object) input) + '\'', e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo6302d(InterfaceC6945c interfaceC6945c);
}
