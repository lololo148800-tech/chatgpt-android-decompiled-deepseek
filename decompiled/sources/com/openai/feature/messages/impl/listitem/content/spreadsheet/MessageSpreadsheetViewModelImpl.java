package com.openai.feature.messages.impl.listitem.content.spreadsheet;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p098Di.InterfaceC2053b;
import p1155zi.C21920H0;
import p145Ff.C2730h;
import p364Oh.AbstractC6224C;
import p364Oh.C6223B;
import p480Te.C7392q;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p909nm.C17690x;
import p991rh.C19003l;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/spreadsheet/MessageSpreadsheetViewModelImpl;", "Lcom/openai/feature/messages/impl/listitem/content/spreadsheet/MessageSpreadsheetViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageSpreadsheetViewModelImpl extends MessageSpreadsheetViewModel {

    /* JADX INFO: renamed from: i */
    public final C7392q f38855i;

    public MessageSpreadsheetViewModelImpl(C7392q c7392q) {
        super(new C2730h(C17690x.f56481Y));
        this.f38855i = c7392q;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.openai.feature.messages.impl.listitem.content.spreadsheet.MessageSpreadsheetViewModel
    /* JADX INFO: renamed from: n */
    public final Object mo14318n(String str, AbstractC19687c abstractC19687c) {
        MessageSpreadsheetViewModelImpl$getDownloadLink$1 messageSpreadsheetViewModelImpl$getDownloadLink$1;
        MessageSpreadsheetViewModelImpl messageSpreadsheetViewModelImpl;
        if (abstractC19687c instanceof MessageSpreadsheetViewModelImpl$getDownloadLink$1) {
            messageSpreadsheetViewModelImpl$getDownloadLink$1 = (MessageSpreadsheetViewModelImpl$getDownloadLink$1) abstractC19687c;
            int i10 = messageSpreadsheetViewModelImpl$getDownloadLink$1.f38860q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messageSpreadsheetViewModelImpl$getDownloadLink$1.f38860q0 = i10 - Integer.MIN_VALUE;
            } else {
                messageSpreadsheetViewModelImpl$getDownloadLink$1 = new MessageSpreadsheetViewModelImpl$getDownloadLink$1(this, abstractC19687c);
            }
        } else {
            messageSpreadsheetViewModelImpl$getDownloadLink$1 = new MessageSpreadsheetViewModelImpl$getDownloadLink$1(this, abstractC19687c);
        }
        Object objM7792b = messageSpreadsheetViewModelImpl$getDownloadLink$1.f38858o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messageSpreadsheetViewModelImpl$getDownloadLink$1.f38860q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM7792b);
            AbstractC6224C abstractC6224C = (AbstractC6224C) ((C2730h) m14391f()).f8383a.get(new C21920H0(str));
            if (abstractC6224C instanceof C6223B) {
                C19003l c19003l = (C19003l) ((C6223B) abstractC6224C).f20258a;
                String str2 = c19003l != null ? c19003l.f60582b : null;
                if (str2 != null && str2.length() != 0) {
                    return abstractC6224C;
                }
            }
            messageSpreadsheetViewModelImpl$getDownloadLink$1.f38856Y = this;
            messageSpreadsheetViewModelImpl$getDownloadLink$1.f38857Z = str;
            messageSpreadsheetViewModelImpl$getDownloadLink$1.f38860q0 = 1;
            objM7792b = this.f38855i.m7792b(str, messageSpreadsheetViewModelImpl$getDownloadLink$1);
            if (objM7792b == enumC19250a) {
                return enumC19250a;
            }
            messageSpreadsheetViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = messageSpreadsheetViewModelImpl$getDownloadLink$1.f38857Z;
            messageSpreadsheetViewModelImpl = messageSpreadsheetViewModelImpl$getDownloadLink$1.f38856Y;
            AbstractC9233X.m9807c(objM7792b);
        }
        AbstractC6224C abstractC6224C2 = (AbstractC6224C) objM7792b;
        messageSpreadsheetViewModelImpl.m14397m(new MessageSpreadsheetViewModelImpl$getDownloadLink$2(str, abstractC6224C2));
        return abstractC6224C2;
    }
}
