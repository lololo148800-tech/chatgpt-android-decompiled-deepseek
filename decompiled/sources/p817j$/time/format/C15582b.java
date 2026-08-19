package p817j$.time.format;

import java.util.Iterator;
import java.util.Locale;
import p817j$.time.chrono.InterfaceC15555k;
import p817j$.time.temporal.InterfaceC15635o;

/* JADX INFO: renamed from: j$.time.format.b */
/* JADX INFO: loaded from: classes4.dex */
final class C15582b extends C15575B {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C15574A f48660e;

    C15582b(C15574A c15574a) {
        this.f48660e = c15574a;
    }

    @Override // p817j$.time.format.C15575B
    /* JADX INFO: renamed from: e */
    public final String mo17007e(InterfaceC15555k interfaceC15555k, InterfaceC15635o interfaceC15635o, long j10, TextStyle textStyle, Locale locale) {
        return this.f48660e.m17001a(j10, textStyle);
    }

    @Override // p817j$.time.format.C15575B
    /* JADX INFO: renamed from: f */
    public final String mo17008f(InterfaceC15635o interfaceC15635o, long j10, TextStyle textStyle, Locale locale) {
        return this.f48660e.m17001a(j10, textStyle);
    }

    @Override // p817j$.time.format.C15575B
    /* JADX INFO: renamed from: g */
    public final Iterator mo17009g(InterfaceC15555k interfaceC15555k, InterfaceC15635o interfaceC15635o, TextStyle textStyle, Locale locale) {
        return this.f48660e.m17002b(textStyle);
    }

    @Override // p817j$.time.format.C15575B
    /* JADX INFO: renamed from: h */
    public final Iterator mo17010h(InterfaceC15635o interfaceC15635o, TextStyle textStyle, Locale locale) {
        return this.f48660e.m17002b(textStyle);
    }
}
