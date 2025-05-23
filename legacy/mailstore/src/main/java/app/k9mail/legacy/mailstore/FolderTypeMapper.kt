package app.k9mail.legacy.mailstore

import app.k9mail.core.mail.folder.api.FolderType
import net.thunderbird.core.android.account.LegacyAccount

object FolderTypeMapper {

    fun folderTypeOf(account: LegacyAccount, folderId: Long) = when (folderId) {
        account.inboxFolderId -> FolderType.INBOX
        account.outboxFolderId -> FolderType.OUTBOX
        account.sentFolderId -> FolderType.SENT
        account.trashFolderId -> FolderType.TRASH
        account.draftsFolderId -> FolderType.DRAFTS
        account.archiveFolderId -> FolderType.ARCHIVE
        account.spamFolderId -> FolderType.SPAM
        else -> FolderType.REGULAR
    }
}
