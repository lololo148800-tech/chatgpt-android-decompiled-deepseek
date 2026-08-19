package io.sentry;

import android.gov.nist.javax.sip.header.ParameterNames;
import io.sentry.clientreport.C15335c;
import io.sentry.protocol.C15421A;
import p658b5.C11248s;

/* JADX INFO: renamed from: io.sentry.h1 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15361h1 implements InterfaceC15374i0 {
    Session(ParameterNames.SESSION),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Statsd("statsd"),
    Feedback("feedback"),
    Unknown("__unknown__");

    private final String itemType;

    EnumC15361h1(String str) {
        this.itemType = str;
    }

    public static EnumC15361h1 resolve(Object obj) {
        if (obj instanceof C15347d1) {
            return Event;
        }
        if (obj instanceof C15421A) {
            return Transaction;
        }
        if (obj instanceof C15132I1) {
            return Session;
        }
        return obj instanceof C15335c ? ClientReport : Attachment;
    }

    public static EnumC15361h1 valueOfLabel(String str) {
        for (EnumC15361h1 enumC15361h1 : values()) {
            if (enumC15361h1.itemType.equals(str)) {
                return enumC15361h1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.InterfaceC15374i0
    public void serialize(InterfaceC15523y0 interfaceC15523y0, InterfaceC15127H interfaceC15127H) {
        ((C11248s) interfaceC15523y0).m12660D(this.itemType);
    }
}
